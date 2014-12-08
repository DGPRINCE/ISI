
public ArrayList<Conge> ListCong()
     {
        ArrayList<Conge> liste=new ArrayList<Conge>();
         try
         {//Mr regarde moi la ligne suivatn sa marche pas
             st=con.prepareStatement("select * from conge");
             rs=st.executeQuery();
                     while(rs.next())
                     {
                    	 Conge cong=new Conge();
                    	 cong.setCodeCong(rs.getInt("code_cong"));
                    	 cong.setDatedbcong(rs.getString("dated_cong"));
                    	 cong.setDatefincong(rs.getString("datefin_cong"));
                         cong.setCodePer(rs.getInt("code_per"));
                         liste.add(cong);
                     }
         }
                    catch(SQLException ex)
                    {
                        System.out.println(ex.getMessage());
                        
                    }
         return liste;
         JOptionpane.ShowMessageDialog(null, "Bonjour bienvenu sur githud");
         }
