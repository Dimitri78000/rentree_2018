/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memcpy.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/12 15:08:32 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/12 15:08:33 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"

void	*ft_memcpy(void *dst, const void *src, size_t n)
{
	unsigned int	i;
	void			*dst_start;
	char			*dst_char;
	char			*src_char;

	dst_start = dst;
	dst_char = (char *)dst;
	src_char = (char *)src;
	i = 0;
	while (i < n)
	{
		dst_char[i] = src_char[i];
		i++;
	}
	return (dst_start);
}
