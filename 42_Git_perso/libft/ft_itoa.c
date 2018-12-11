/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strnew.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/12/01 18:35:42 by dleurs            #+#    #+#             */
/*   Updated: 2018/12/01 18:35:43 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

//#include "libft.h"
#include <stdlib.h>

unsigned int		ft_strlen(const char *s)
{
	unsigned int i;

	i = 0;
	while (s[i] != '\0')
		i++;
	return (i);
}

void			*ft_memset(void *str, int c, size_t len)
{
	unsigned char	*my_str;
	unsigned int	i;

	my_str = (unsigned char *)str;
	i = 0;
	while (i < len)
	{
		my_str[i] = (unsigned char)c;
		i++;
	}
	return (str);
}

void	ft_bzero(void *s, size_t n)
{
	ft_memset(s, 0, n);
}

char	*ft_strrev(char *str_ini)
{
	int 	i;
	int 	len;
	char	*str;

	i = 0;
	len = ft_strlen(str_ini);
	len--;
	str = (char *)malloc(sizeof(char) * 12);
	while (i <= len)
	{
		str[i] = str_ini[len - i];
		i++;
	}
	str[i] = '\0';
	return (str);
}
#include <stdio.h>
char 	*ft_itoa(int n)
{
	char 	*str;
	int		i;

	i = 11;
	str = (char *)malloc(sizeof(char) * 13);
	if (str == NULL)
		return (NULL);
	ft_bzero(str, 13);
	if (n == -2147483648)
		return ("-2147483648");  
	str[12]='\0';
	if (n < 0)
	{
		str[i] = '-';
		printf("%s\n", ft_strrev(str));
		i--;
		n = n * (-1);
	}
	while (n >= 10)
	{
		str[i] = (n % 10) + 48;
		i--;
		n = n / 10;
	}
	return(ft_strrev(str));
}

#include <stdio.h>
int main(void)
{
	printf("%s\n", ft_itoa(87647));
	return (0);
}