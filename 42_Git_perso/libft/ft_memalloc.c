/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_memalloc.c                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/24 19:54:21 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/24 19:54:22 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <stdlib.h>

void	*ft_memalloc(size_t size)
{
	void	*memory;

	memory = (void *)malloc(size * sizeof(size_t));
	if (memory == NULL)
		return (NULL);
	ft_bzero(memory, size);
	return (memory);
}
