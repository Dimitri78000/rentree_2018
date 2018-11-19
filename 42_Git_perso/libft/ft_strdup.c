/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strdup.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/06 20:26:06 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/06 20:26:07 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdlib.h>

char		*ft_strdup(const char *s1)
{
	int		len;
	char	*str_res;
	int		i;

	len = 0;
	while (s1[len] != '\0')
		len++;
	str_res = (char*)malloc(sizeof(char) * (len + 1));
	if (str_res == NULL)
		return (NULL);
	i = 0;
	while (i < len)
	{
		str_res[i] = s1[i];
		i++;
	}
	str_res[i] = '\0';
	return (str_res);
}
