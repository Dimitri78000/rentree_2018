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
#include "libft.h"

void	*ft_memmove(void *dst, const void *src, size_t len)
{
	unsigned int	i;
	void			*dst_start;
	unsigned char	*dst_char;
	unsigned char	*src_char;
	int				j;

	dst_start = dst;
	dst_char = (unsigned char *)dst;
	src_char = (unsigned char *)src;
	i = 0;
	if (dst < src)
		ft_memcpy(dst, src, len);
	else
	{
		j = len - 1;
		while (j >= 0)
		{
			dst_char[j] = src_char[j];
			j--;
		}
	}
	return (dst_start);
}
