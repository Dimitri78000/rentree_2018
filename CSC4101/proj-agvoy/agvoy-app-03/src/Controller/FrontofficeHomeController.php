<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\Routing\Annotation\Route;

class FrontofficeHomeController extends AbstractController
{
    /**
     * @Route("/home", name="frontoffice_home")
     */
    public function index()
    {
    	$circuits = $em->getRepository(Circuit::class)->findAll();
      	dump($circuits);

        return $this->render('front/home.html.twig', [
            'circuits' => $circuit,
        ]);
    }
}
