/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strtrim.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/12/01 20:27:07 by dleurs            #+#    #+#             */
/*   Updated: 2018/12/01 20:27:08 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdlib.h>
#include "libft.h"

int					ft_onlyblank(char const *s)
{
	int i;

	i = 0;
	while (s[i] != '\0')
	{
		if (s[i] != ' ' && s[i] != '\t' && s[i] != '\n')
			return (0);
		i++;
	}
	return (1);
}

unsigned int		ft_strim(char const *s, unsigned int *i, unsigned int *end)
{
	*i = 0;
	*end = ft_strlen(s) - 1;
	while (s[*i] != '\0' && (s[*i] == ' ' || s[*i] == '\t' || s[*i] == '\n'))
		(*i)++;
	while (s[*end] == ' ' || s[*end] == '\t' || s[*end] == '\n')
		(*end)--;
	return (*end - *i + 1);
}


char		*ft_strtrim(char const *s)
{
	unsigned int 	j;
	unsigned int 	i;
	char			*str;
	unsigned int 	end;
	unsigned int	len;

	if (s == NULL)
		return (NULL);
	if (s[0] == '\0' || ft_onlyblank(s))
		return ("");
	j = 0;
	len = ft_strim(s, &i, &end);
	str = (char *)malloc(sizeof(char) * (len + 1));
	if (str == NULL)
		return (NULL);
	while (j < len)
	{
		str[j] = s[i];
		i++;
		j++;
	}
	str[j] = '\0';
	return (str);
}
