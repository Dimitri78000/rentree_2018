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
SRC = ft_atoi.c
OBJECT_O = ft_atoi.o
HEADER = includes

all: $(NAME)

$(NAME):
	gcc -c -I$(HEADER) $(SRC)
	ar rc $(NAME) $(OBJECT_O)
	ranlib $(NAME)

clean:
	/bin/rm -f $(OBJECT_O)

fclean: clean
	/bin/rm -f $(NAME)

re: fclean all
