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

#include <string.h>

char	*ft_strrchr(char *str, int c)
{
	int i;
	int i_last;

	i = 0;
	i_last = -1;
	while (str[i] != '\0')
	{
		if (str[i] == c)
			i_last = i;
		i++;
	}
	if (i_last == -1)
		return (NULL);
	return (&str[i_last]);
}
