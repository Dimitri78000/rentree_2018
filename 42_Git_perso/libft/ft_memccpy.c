/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memccpy.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 15:19:44 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 15:19:45 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include "libft.h"

void				*ft_memccpy(void *dst, const void *src, int c, size_t n)
{
	unsigned int			i;
	unsigned char			*dst_char;
	unsigned char			*src_char;
	unsigned char			c_char;

	dst_char = (unsigned char *)dst;
	src_char = (unsigned char *)src;
	c_char = (unsigned char)c;
	i = 0;
	while (i < n)
	{
		dst_char[i] = src_char[i];
		if (src_char[i] == c_char)
			return (dst + i + 1);
		i++;
	}
	return (NULL);
}
