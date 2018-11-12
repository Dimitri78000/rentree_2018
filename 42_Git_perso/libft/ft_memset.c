/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memset.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 12:20:25 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 12:20:26 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

void	*ft_memset(void *str, int c, unsigned int len)
{
	int i;
	char *str_start;
	char *my_str;

	str_start = str;
	my_str = str;
	i = 0;
	while (i < (int)len && my_str[i] != '\0')
	{
		my_str[i] = c;
		printf("%c %d %d\n", my_str[i], i, len );
		i++;
	}
	return (str_start);
}
