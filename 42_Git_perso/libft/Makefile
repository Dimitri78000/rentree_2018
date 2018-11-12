# **************************************************************************** #
#                                                                              #
#                                                         :::      ::::::::    #
#    Makefile                                           :+:      :+:    :+:    #
#                                                     +:+ +:+         +:+      #
#    By: dleurs <marvin@42.fr>                      +#+  +:+       +#+         #
#                                                 +#+#+#+#+#+   +#+            #
#    Created: 2018/11/06 18:59:43 by dleurs            #+#    #+#              #
#    Updated: 2018/11/06 18:59:44 by dleurs           ###   ########.fr        #
#                                                                              #
# **************************************************************************** #

NAME = libft.a 
SRC = ft_bzero.c ft_memset.c ft_memcpy.c ft_memccpy.c ft_memmove.c ft_memchr.c
OBJECT_O = ft_bzero.o ft_memset.o ft_memcpy.o ft_memccpy.o ft_memmove.o ft_memchr.o

all: $(NAME)

$(NAME):
	gcc -c $(SRC)
	ar rc $(NAME) $(OBJECT_O)
	ranlib $(NAME)

clean:
	/bin/rm -f $(OBJECT_O)

fclean: clean
	/bin/rm -f $(NAME)

re: fclean all
