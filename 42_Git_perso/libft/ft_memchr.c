/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memchr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 16:33:09 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 16:33:10 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <string.h>

void				*ft_memchr(const void *s, int c, size_t n)
{
	unsigned int i;
	unsigned char c_char;
	unsigned char *str;

	c_char = (unsigned char)c;
	str = (unsigned char *)s;
	i = 0;
	while (str[i] != '\0')
	{
		if (str[i] == c_char)
			return (&str[i]);
		i++;
	}
	return (NULL);
}
