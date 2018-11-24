/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strrchr.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/06 20:54:53 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/06 20:54:54 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <string.h>

char	*ft_strrchr(const char *s, int c)
{
	int i;
	int i_last;

	i = 0;
	i_last = -1;
	if ((char)c == '\0')
	{
		i_last = ft_strlen(s);
		return ((char *)&s[i_last]);
	}
	while (s[i] != '\0')
	{
		if (s[i] == (char)c)
			i_last = i;
		i++;
	}
	if (i_last == -1)
		return (NULL);
	return ((char *)&s[i_last]);
}
