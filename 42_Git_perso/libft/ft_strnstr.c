/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strnstr.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/24 17:19:14 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/24 17:19:16 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"

char		*ft_strnstr(const char *haystack, const char *needle, size_t len)
{
	unsigned int	i_str;
	unsigned int	i_word;
	unsigned int	len_str;
	unsigned int	len_word;

	len_str = ft_strlen(haystack);
	len_word = ft_strlen(needle);
	if (!needle[0])
		return ((char *)haystack);
	i_str = 0;
	while (i_str <= len_str)
	{
		i_word = 0;
		while (haystack[i_str + i_word] == needle[i_word] && i_word < len)
		{
			i_word++;
			if (i_word == len_word)
				return ((char *)&haystack[i_str]);
		}
		i_str++;
	}
	return (NULL);
}
