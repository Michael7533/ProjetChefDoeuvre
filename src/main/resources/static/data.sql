insert into activite (id_activite,code_activite, libelle_activite, ordre) values (1,'ttt','libelle',1);
insert into activite (id_activite,code_activite, libelle_activite, ordre) values (2,'tkl','libelle 2',2);
insert into activite (id_activite,code_activite, libelle_activite, ordre) values (3,'kkk','libelle 3',1);
insert into referentiel_tache(id_ref_tache, code_ref_tache, code_tache_retour, id_activite, libelle_tache, parcours_utilisateur, typecontrat) values (1,1,1,1,'parcut1','codetacheretour1',1);
insert into referentiel_tache(id_ref_tache, code_ref_tache, code_tache_retour, id_activite, libelle_tache, parcours_utilisateur, typecontrat) values (2,1,5,1,'parcut2','codetacheretour1',1);
insert into referentiel_tache(id_ref_tache, code_ref_tache, code_tache_retour, id_activite, libelle_tache, parcours_utilisateur, typecontrat) values (3,1,1,7,'parcut3','codetacheretour2',3);
insert into referentiel_tache(id_ref_tache, code_ref_tache, code_tache_retour, id_activite, libelle_tache, parcours_utilisateur, typecontrat) values (4,2,1,1,'parcut4','codetacheretour1',1);
insert into tache(id_tache, date_creation, date_miseajour, etat, id_dossier, id_ref_tache, maturite, top_erreur_relanc_auto) Values (1, '2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000','en attente','1','2',true,false);
insert into tache(id_tache, date_creation, date_miseajour, etat, id_dossier, id_ref_tache, maturite, top_erreur_relanc_auto) Values (2, '2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000','en attente','1','2',true,false);
insert into tache(id_tache, date_creation, date_miseajour, etat, id_dossier, id_ref_tache, maturite, top_erreur_relanc_auto) Values (3, '2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000','traité','2','3',false,true);
insert into tache(id_tache, date_creation, date_miseajour, etat, id_dossier, id_ref_tache, maturite, top_erreur_relanc_auto) Values (4, '2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000','abandonné','3','1',true,false);
insert into utilisateur_tache(id_utilisateur_tache, date_debut, date_fin, id_tache, id_utilisateur, libelle_abandon, motif_abandon, statut) values (1,'2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000',1,1,'libabandon','motifabandon','traite');
insert into utilisateur_tache(id_utilisateur_tache, date_debut, date_fin, id_tache, id_utilisateur, libelle_abandon, motif_abandon, statut) values (2,'2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000',1,1,'libabandon','motifabandon','traité');
insert into utilisateur_tache(id_utilisateur_tache, date_debut, date_fin, id_tache, id_utilisateur, libelle_abandon, motif_abandon, statut) values (3,'2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000',1,1,'libabandon','motifabandon','en attente');
insert into utilisateur_tache(id_utilisateur_tache, date_debut, date_fin, id_tache, id_utilisateur, libelle_abandon, motif_abandon, statut) values (4,'2021-08-12 10:39:30.000000','2021-08-12 10:39:30.000000',1,1,'libabandon','pas envie','abandonné');
insert into utilisateur(id_utilisateur, nom, prenom, user_name) values (1,'nom1','prenom1','user1');
insert into utilisateur(id_utilisateur, nom, prenom, user_name) values (2,'nom2','prenom2','user2');
insert into utilisateur(id_utilisateur, nom, prenom, user_name) values (3,'nom3','prenom3','user3');
