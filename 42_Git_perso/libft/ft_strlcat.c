/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strlcat.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 18:40:56 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 18:40:57 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <string.h>

size_t		ft_strlcat(char *dst, const char *src, size_t size)
{
	size_t i;
	size_t j;
	size_t src_len;
	size_t dst_len;

	i = ft_strlen(dst);
	j = 0;
	src_len = ft_strlen(src);
	dst_len = ft_strlen(dst);
	if (size < dst_len + 1)
		return (src_len + size);
	else if (size > dst_len + 1)
	{
		while (i < size - 1)
		{
			dst[i] = src[j];
			i++;
			j++;
		}
		dst[i] = '\0';
	}
	return (dst_len + src_len);
}
