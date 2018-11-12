/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memmove.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 15:43:19 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 15:43:21 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "string.h"

void	*ft_memmove(void *dst, const void *src, size_t len)
{
	void *dst_start;

	dst_start = dst;
	if (dst < src)
		while ((size_t)(dst - dst_start) < len)
			*(unsigned char *)dst++ = *(unsigned char *)src++;
	else
		while (len)
		{
			len--;
			((unsigned char *)dst)[len] = ((unsigned char *)src)[len];
		}
	return (dst_start);
}
