/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strstr.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/11/06 20:22:09 by dleurs            #+#    #+#             */
/*   Updated: 2018/11/06 20:22:11 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include "libft.h"

char	*ft_strstr(const char *haystack, const char *needle)
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
		while (haystack[i_str + i_word] == needle[i_word])
		{
			i_word++;
			if (needle[i_word] == '\0')
				return ((char *)&haystack[i_str]);
		}
		i_str++;
	}
	return (NULL);
}
