/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strnew.c                                        :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: dleurs <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2018/12/01 18:37:42 by dleurs            #+#    #+#             */
/*   Updated: 2018/12/01 18:37:43 by dleurs           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include "libft.h"
#include <stdlib.h>

int		ft_strlen_spc(char const *str, char c)
{
	int i;

	i = 0;
	while (str[i] != '\0' && str[i] != c)
		i++;
	return (i);
}

int		nb_of_words(char const *str, char c)
{
	int nb_of_words;
	int i;

	nb_of_words = 0;
	i = 0;
	while (str[i] != '\0')
	{
		if (ft_strlen_spc(&str[i], c) != 0)
		{
			nb_of_words += 1;
			i += ft_strlen_spc(&str[i], c) - 1 + 1;
		}
		else
			i++;
	}
	return (nb_of_words);
}

void	add_word_to_tab(char **tab, int i, int index_word, char const *str, char c)
{
	int j;

	tab[index_word] = malloc(sizeof(char*) * (ft_strlen_spc(&str[i], c) + 1));
	j = 0;
	while (j < ft_strlen_spc(&str[i - j], c))
	{
		tab[index_word][j] = str[i];
		i++;
		j++;
	}
	tab[index_word][j] = '\0';
}

char 	**ft_strsplit(char const *s, char c)
{
	int		i;
	char	**tab_of_tab;
	int		index_word;

	tab_of_tab = malloc(sizeof(char**) * (nb_of_words(s, c) + 1));
	if (tab_of_tab == NULL)
		return (NULL);
	index_word = 0;
	i = 0;
	while (s[i] != '\0')
	{
		if (ft_strlen_spc(&s[i], c) != 0 && index_word < nb_of_words(s, c))
		{
			add_word_to_tab(tab_of_tab, i, index_word, s, c);
			i += ft_strlen_spc(&s[i], c) - 1;
			index_word++;
		}
		i++;
	}
	tab_of_tab[nb_of_words(s, c)] = 0;
	return (tab_of_tab);
}
