package Interface;
import Controller.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.DefaultListModel;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class RestaurantMainPage extends javax.swing.JFrame {

    public RestaurantMainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginAuthentication = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Login = new javax.swing.JLabel();
        Msgs = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        currentID = new javax.swing.JTextField();
        currentType = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Background3 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        Manager = new javax.swing.JPanel();
        gotoEmp = new javax.swing.JLabel();
        gotoTableStatus = new javax.swing.JLabel();
        gotoOrdering = new javax.swing.JLabel();
        gotoMenu = new javax.swing.JLabel();
        logoutManagerBtn = new javax.swing.JLabel();
        gotoInventory = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        Emp = new javax.swing.JPanel();
        EmpScollPane = new javax.swing.JScrollPane();
        EmployeeList = new javax.swing.JList();
        selectEmpBtn = new javax.swing.JButton();
        EmpIDScrollPane = new javax.swing.JScrollPane();
        EmployeeIdList = new javax.swing.JList();
        empFirstName = new javax.swing.JTextField();
        empLastName = new javax.swing.JTextField();
        empMiddleName = new javax.swing.JTextField();
        empUsername = new javax.swing.JTextField();
        empPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addEmpBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        editEmpBtn = new javax.swing.JButton();
        clearEmpBtn = new javax.swing.JButton();
        backEmp = new javax.swing.JLabel();
        empWage = new javax.swing.JFormattedTextField();
        empType = new javax.swing.JComboBox();
        cancelEmpBtn = new javax.swing.JButton();
        removeEmpBtn = new javax.swing.JButton();
        empSSN = new javax.swing.JFormattedTextField();
        Background5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        OrderManager = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuList = new javax.swing.JList();
        foodDetails = new javax.swing.JScrollPane();
        foodDetail = new javax.swing.JTextArea();
        addOrderBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        OrderedList = new javax.swing.JList();
        clearOrderListBtn = new javax.swing.JButton();
        submitOrderBtn = new javax.swing.JButton();
        removeOrderBtn = new javax.swing.JButton();
        qtySlider = new javax.swing.JSlider();
        qtyLabel = new javax.swing.JTextField();
        addQtyBtn = new javax.swing.JButton();
        orderBack = new javax.swing.JLabel();
        Background7 = new javax.swing.JLabel();
        orderIdPane = new javax.swing.JScrollPane();
        orderIdList = new javax.swing.JList();
        orderIdList.setModel(new DefaultListModel());
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        menuItemsList = new javax.swing.JScrollPane();
        menuItemList = new javax.swing.JList();
        menuItemName = new javax.swing.JTextField();
        editMenuItemBtn = new javax.swing.JButton();
        menuItemDes = new javax.swing.JScrollPane();
        menuItemDescription = new javax.swing.JTextPane();
        addMenuItem = new javax.swing.JButton();
        clearMenuInsert = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idMenuList = new javax.swing.JScrollPane();
        menuIdList = new javax.swing.JList();
        removeMenuItemBtn = new javax.swing.JButton();
        editMenuCancelBtn = new javax.swing.JButton();
        addMenuItemDes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        updateMenuItemBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        additionId = new javax.swing.JScrollPane();
        additionIdList = new javax.swing.JList();
        inventoryMenu = new javax.swing.JScrollPane();
        inventoryMenuList = new javax.swing.JList();
        ItemPrice = new javax.swing.JFormattedTextField();
        menuBack = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        Chef = new javax.swing.JPanel();
        LogOutChef = new javax.swing.JLabel();
        updateOrderStatusBtn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        backgroundChef = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        Host = new javax.swing.JPanel();
        gotoTableStatusLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gotoTableStatus1 = new javax.swing.JLabel();
        LogOutHost = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TableStatus = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListofTables = new javax.swing.JList();
        TableStatusBox = new javax.swing.JComboBox();
        UpdateStatusBtn = new javax.swing.JButton();
        backTableStatus = new javax.swing.JLabel();
        statusListPane = new javax.swing.JScrollPane();
        statusList = new javax.swing.JList();
        TableNo = new javax.swing.JComboBox();
        Background6 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Inventory = new javax.swing.JPanel();
        menuItemListScrollPane1 = new javax.swing.JScrollPane();
        inventoryItemList = new javax.swing.JList();
        jLabel25 = new javax.swing.JLabel();
        inventoryId = new javax.swing.JScrollPane();
        inventoryIdList = new javax.swing.JList();
        removeInventoryItemBtn = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        inventoryBack = new javax.swing.JLabel();
        inventoryName = new javax.swing.JScrollPane();
        inventoryNameList = new javax.swing.JList();
        inventoryStock = new javax.swing.JScrollPane();
        inventoryStockList = new javax.swing.JList();
        addInventoryAmt = new javax.swing.JFormattedTextField();
        addInventoryName = new javax.swing.JTextField();
        addInventoryItemBtn = new javax.swing.JButton();
        Background8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        orderScrollPane = new javax.swing.JScrollPane();
        orderIDs = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurant Automation");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setName("LoginMain"); // NOI18N

        LoginAuthentication.setBackground(new java.awt.Color(132, 55, 55));
        LoginAuthentication.setToolTipText("");
        LoginAuthentication.setMaximumSize(new java.awt.Dimension(1024, 768));
        LoginAuthentication.setMinimumSize(new java.awt.Dimension(1024, 768));
        LoginAuthentication.setPreferredSize(new java.awt.Dimension(1400, 768));
        LoginAuthentication.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Username.setToolTipText("Enter username here.");
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        LoginAuthentication.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 300, -1));
        Username.getAccessibleContext().setAccessibleName("UserName");
        Username.getAccessibleContext().setAccessibleDescription("");

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/log in btn.jpg"))); // NOI18N
        Login.setMaximumSize(new java.awt.Dimension(200, 74));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });
        LoginAuthentication.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        Msgs.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Msgs.setForeground(new java.awt.Color(255, 0, 0));
        Msgs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Msgs.setText("Temp");
        LoginAuthentication.add(Msgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 910, 40));

        Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Password.setToolTipText("Enter password here.");
        LoginAuthentication.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 300, 40));
        LoginAuthentication.add(currentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 50, -1));
        LoginAuthentication.add(currentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 570, 50, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Enter Username and Password to Log In");
        LoginAuthentication.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 350, -1));

        jLabel26.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Welcome to the Restaurant!");
        LoginAuthentication.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 750, 60));

        Background3.setBackground(new java.awt.Color(204, 204, 255));
        Background3.setAlignmentY(0.0F);
        LoginAuthentication.add(Background3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Username");
        LoginAuthentication.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 100, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Password");
        LoginAuthentication.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        Manager.setBackground(new java.awt.Color(132, 55, 55));
        Manager.setMaximumSize(new java.awt.Dimension(1023, 767));
        Manager.setMinimumSize(new java.awt.Dimension(1023, 767));
        Manager.setPreferredSize(new java.awt.Dimension(1400, 850));
        Manager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gotoEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Employee profile.gif"))); // NOI18N
        gotoEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoEmpMouseClicked(evt);
            }
        });
        Manager.add(gotoEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 130, 90));

        gotoTableStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/table status btn.gif"))); // NOI18N
        gotoTableStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoTableStatusMouseClicked(evt);
            }
        });
        Manager.add(gotoTableStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, -1));

        gotoOrdering.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/place order btn.png"))); // NOI18N
        gotoOrdering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoOrderingMouseClicked(evt);
            }
        });
        Manager.add(gotoOrdering, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 170, 60));

        gotoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/edit menu btn.gif"))); // NOI18N
        gotoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoMenuMouseClicked(evt);
            }
        });
        Manager.add(gotoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 130, 140));

        logoutManagerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/log out btn.png"))); // NOI18N
        logoutManagerBtn.setMaximumSize(new java.awt.Dimension(200, 74));
        logoutManagerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutManagerBtnMouseClicked(evt);
            }
        });
        Manager.add(logoutManagerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 280, 70));

        gotoInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/view stock btn.gif"))); // NOI18N
        gotoInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoInventoryMouseClicked(evt);
            }
        });
        Manager.add(gotoInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, -1, 100));

        jLabel9.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Welcome Manager!");
        Manager.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 520, 130));

        Background.setBackground(new java.awt.Color(204, 204, 255));
        Background.setAlignmentY(0.0F);
        Background.setPreferredSize(new java.awt.Dimension(800, 366));
        Manager.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Emp.setBackground(new java.awt.Color(132, 55, 55));
        Emp.setMaximumSize(new java.awt.Dimension(1023, 769));
        Emp.setMinimumSize(new java.awt.Dimension(1023, 769));
        Emp.setPreferredSize(new java.awt.Dimension(1400, 850));
        Emp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        EmployeeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        EmployeeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeListMouseClicked(evt);
            }
        });
        EmpScollPane.setViewportView(EmployeeList);

        Emp.add(EmpScollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 360, 200));

        selectEmpBtn.setText("Select Employee");
        selectEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEmpBtnActionPerformed(evt);
            }
        });
        Emp.add(selectEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 180, 30));

        EmployeeIdList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        EmpIDScrollPane.setViewportView(EmployeeIdList);

        Emp.add(EmpIDScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 658, 80, 80));

        empFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empFirstNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empFirstNameKeyReleased(evt);
            }
        });
        Emp.add(empFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 130, -1));

        empLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empLastNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empLastNameKeyReleased(evt);
            }
        });
        Emp.add(empLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 130, -1));

        empMiddleName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empMiddleNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empMiddleNameKeyReleased(evt);
            }
        });
        Emp.add(empMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 130, -1));

        empUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empUsernameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empUsernameKeyReleased(evt);
            }
        });
        Emp.add(empUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 130, -1));

        empPassword.setForeground(new java.awt.Color(255, 255, 255));
        empPassword.setToolTipText("");
        empPassword.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        empPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPasswordActionPerformed(evt);
            }
        });
        empPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empPasswordKeyReleased(evt);
            }
        });
        Emp.add(empPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 140, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name");
        Emp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name");
        Emp.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Middle Initial");
        Emp.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Wage");
        Emp.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Social Security Number");
        Emp.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jLabel6.setToolTipText("");
        Emp.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");
        jLabel7.setToolTipText("");
        Emp.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        addEmpBtn.setText("Add Employee");
        addEmpBtn.setEnabled(false);
        addEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpBtnActionPerformed(evt);
            }
        });
        Emp.add(addEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 230, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type");
        jLabel8.setToolTipText("");
        Emp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, -1));

        editEmpBtn.setText("Edit Employee");
        editEmpBtn.setEnabled(false);
        editEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpBtnActionPerformed(evt);
            }
        });
        Emp.add(editEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 230, 30));

        clearEmpBtn.setText("Clear");
        clearEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearEmpBtnActionPerformed(evt);
            }
        });
        Emp.add(clearEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 220, 30));

        backEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/back btn.png"))); // NOI18N
        backEmp.setToolTipText("");
        backEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backEmpMouseClicked(evt);
            }
        });
        Emp.add(backEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        empWage.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        empWage.setText("0.00");
        empWage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empWageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empWageKeyReleased(evt);
            }
        });
        Emp.add(empWage, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 140, -1));

        empType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Waiter", "Manager", "Chef", "Host" }));
        empType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empTypeActionPerformed(evt);
            }
        });
        Emp.add(empType, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 130, -1));

        cancelEmpBtn.setText("Cancel");
        cancelEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEmpBtnActionPerformed(evt);
            }
        });
        Emp.add(cancelEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 460, 220, 30));

        removeEmpBtn.setText("Remove Employee");
        removeEmpBtn.setToolTipText("");
        removeEmpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmpBtnActionPerformed(evt);
            }
        });
        Emp.add(removeEmpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 170, 30));

        empSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                empSSNKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                empSSNKeyReleased(evt);
            }
        });
        Emp.add(empSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 140, -1));

        Background5.setBackground(new java.awt.Color(204, 204, 255));
        Background5.setAlignmentY(0.0F);
        Emp.add(Background5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel28.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Employee Information");
        Emp.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 590, 60));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Employees List");
        Emp.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, -1));

        OrderManager.setBackground(new java.awt.Color(132, 55, 55));
        OrderManager.setMaximumSize(new java.awt.Dimension(1024, 768));
        OrderManager.setMinimumSize(new java.awt.Dimension(1024, 768));
        OrderManager.setName(""); // NOI18N
        OrderManager.setPreferredSize(new java.awt.Dimension(1024, 768));
        OrderManager.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Menu Item");
        OrderManager.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 114, -1));

        menuList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuList.setModel(new DefaultListModel());
        menuList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(menuList);

        OrderManager.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, 180));

        foodDetails.setBorder(null);
        foodDetails.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        foodDetail.setEditable(false);
        foodDetail.setColumns(20);
        foodDetail.setRows(5);
        foodDetail.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        foodDetails.setViewportView(foodDetail);

        OrderManager.add(foodDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 250, 150));

        addOrderBtn.setText("Add Order");
        addOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBtnActionPerformed(evt);
            }
        });
        OrderManager.add(addOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 200, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Your Current Order");
        OrderManager.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 120, -1));

        OrderedList.setModel(new DefaultListModel());
        OrderedList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderedListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(OrderedList);

        OrderManager.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 240, 150));

        clearOrderListBtn.setText("Remove All");
        clearOrderListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearOrderListBtnActionPerformed(evt);
            }
        });
        OrderManager.add(clearOrderListBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 240, -1));

        submitOrderBtn.setText("Submit Order");
        submitOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderBtnActionPerformed(evt);
            }
        });
        OrderManager.add(submitOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 240, -1));

        removeOrderBtn.setText("Remove");
        removeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeOrderBtnActionPerformed(evt);
            }
        });
        OrderManager.add(removeOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 240, -1));

        qtySlider.setForeground(new java.awt.Color(255, 255, 255));
        qtySlider.setMajorTickSpacing(1);
        qtySlider.setMaximum(5);
        qtySlider.setMinimum(1);
        qtySlider.setPaintLabels(true);
        qtySlider.setPaintTicks(true);
        qtySlider.setSnapToTicks(true);
        qtySlider.setToolTipText("");
        qtySlider.setValue(1);
        OrderManager.add(qtySlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 140, 50));

        qtyLabel.setEditable(false);
        qtyLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qtyLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        OrderManager.add(qtyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 160, -1));

        addQtyBtn.setText("Select Quantity");
        addQtyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQtyBtnActionPerformed(evt);
            }
        });
        OrderManager.add(addQtyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        orderBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/back btn.png"))); // NOI18N
        orderBack.setToolTipText("");
        orderBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderBackMouseClicked(evt);
            }
        });
        OrderManager.add(orderBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        Background7.setBackground(new java.awt.Color(255, 127, 80));
        Background7.setAlignmentY(0.0F);
        OrderManager.add(Background7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        orderIdPane.setViewportView(orderIdList);

        OrderManager.add(orderIdPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 400, 0, 10));

        jLabel32.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Order");
        OrderManager.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        OrderManager.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 390, 150));

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Summary of Orders");
        OrderManager.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        Menu.setBackground(new java.awt.Color(132, 55, 55));
        Menu.setMaximumSize(new java.awt.Dimension(1023, 767));
        Menu.setMinimumSize(new java.awt.Dimension(1023, 767));
        Menu.setPreferredSize(new java.awt.Dimension(1400, 850));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuItemList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItemList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        menuItemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemListMouseClicked(evt);
            }
        });
        menuItemsList.setViewportView(menuItemList);

        Menu.add(menuItemsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, 220));

        menuItemName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                menuItemNameKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                menuItemNameKeyReleased(evt);
            }
        });
        Menu.add(menuItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 190, -1));

        editMenuItemBtn.setText("Edit Item");
        editMenuItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuItemBtnActionPerformed(evt);
            }
        });
        Menu.add(editMenuItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 240, -1));

        menuItemDescription.setEditable(false);
        menuItemDes.setViewportView(menuItemDescription);

        Menu.add(menuItemDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 270, 110));

        addMenuItem.setText("Add Item");
        addMenuItem.setEnabled(false);
        addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemActionPerformed(evt);
            }
        });
        Menu.add(addMenuItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 190, -1));

        clearMenuInsert.setText("Clear");
        clearMenuInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuInsertActionPerformed(evt);
            }
        });
        Menu.add(clearMenuInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 190, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Item List");
        jLabel14.setToolTipText("");
        Menu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Price");
        Menu.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        menuIdList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        idMenuList.setViewportView(menuIdList);

        Menu.add(idMenuList, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 60, 50));

        removeMenuItemBtn.setText("Remove Item");
        removeMenuItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuItemBtnActionPerformed(evt);
            }
        });
        Menu.add(removeMenuItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 210, 30));

        editMenuCancelBtn.setText("Cancel");
        editMenuCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuCancelBtnActionPerformed(evt);
            }
        });
        Menu.add(editMenuCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 190, -1));

        addMenuItemDes.setToolTipText("");
        addMenuItemDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemDesActionPerformed(evt);
            }
        });
        addMenuItemDes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addMenuItemDesKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addMenuItemDesKeyReleased(evt);
            }
        });
        Menu.add(addMenuItemDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 390, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name");
        Menu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, -1, -1));

        updateMenuItemBtn.setText("Update Item");
        updateMenuItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemBtnActionPerformed(evt);
            }
        });
        Menu.add(updateMenuItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 190, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Description");
        Menu.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, 20));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Description");
        jLabel19.setToolTipText("");
        Menu.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Menu Editor");
        Menu.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Current Menu");
        Menu.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        additionIdList.setModel(new DefaultListModel());
        additionId.setViewportView(additionIdList);

        Menu.add(additionId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 90, 90));

        inventoryMenuList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryMenu.setViewportView(inventoryMenuList);

        Menu.add(inventoryMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 60, 40));

        ItemPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#|0.00|"))));
        ItemPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ItemPriceKeyTyped(evt);
            }
        });
        Menu.add(ItemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 190, -1));

        menuBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/back btn.png"))); // NOI18N
        menuBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBackMouseClicked(evt);
            }
        });
        Menu.add(menuBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 180, 40));

        Background2.setAlignmentY(0.0F);
        Menu.add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel33.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Menu");
        Menu.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        Chef.setBackground(new java.awt.Color(132, 55, 55));
        Chef.setMaximumSize(new java.awt.Dimension(1023, 769));
        Chef.setMinimumSize(new java.awt.Dimension(1023, 769));
        Chef.setPreferredSize(new java.awt.Dimension(1400, 850));
        Chef.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogOutChef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/log out btn.png"))); // NOI18N
        LogOutChef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutChefMouseClicked(evt);
            }
        });
        Chef.add(LogOutChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, -1, -1));

        updateOrderStatusBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateOrderStatusBtn.setText("Update Order Status");
        updateOrderStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrderStatusBtnActionPerformed(evt);
            }
        });
        Chef.add(updateOrderStatusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, 40));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        orderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(orderTable);

        Chef.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 740, 250));

        jLabel10.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Welcome Chef!");
        Chef.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        backgroundChef.setBackground(new java.awt.Color(204, 204, 255));
        backgroundChef.setAlignmentY(0.0F);
        Chef.add(backgroundChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 560, 490));

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Your Orders");
        Chef.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        Host.setBackground(new java.awt.Color(132, 55, 55));
        Host.setMaximumSize(new java.awt.Dimension(1023, 769));
        Host.setMinimumSize(new java.awt.Dimension(1023, 769));
        Host.setPreferredSize(new java.awt.Dimension(1400, 850));
        Host.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gotoTableStatusLabel.setAlignmentY(0.0F);
        gotoTableStatusLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoTableStatusLabelMouseClicked(evt);
            }
        });
        Host.add(gotoTableStatusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Welcome Host!");
        jLabel11.setToolTipText("");
        Host.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        gotoTableStatus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/table status btn.gif"))); // NOI18N
        gotoTableStatus1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoTableStatus1MouseClicked(evt);
            }
        });
        Host.add(gotoTableStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 140, 50));

        LogOutHost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/log out btn.png"))); // NOI18N
        LogOutHost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutHostMouseClicked(evt);
            }
        });
        Host.add(LogOutHost, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, -1));

        jLabel29.setBackground(new java.awt.Color(132, 55, 55));
        jLabel29.setAlignmentY(0.0F);
        Host.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 770, 590));

        TableStatus.setBackground(new java.awt.Color(132, 55, 55));
        TableStatus.setMaximumSize(new java.awt.Dimension(1024, 768));
        TableStatus.setMinimumSize(new java.awt.Dimension(1024, 768));
        TableStatus.setPreferredSize(new java.awt.Dimension(1400, 850));
        TableStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Current Table Statuses");
        TableStatus.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        ListofTables.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListofTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListofTablesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ListofTables);

        TableStatus.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 260, 370));

        TableStatusBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "clean", "occupied", "dirty" }));
        TableStatus.add(TableStatusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 130, -1));

        UpdateStatusBtn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        UpdateStatusBtn.setText("Update Status");
        UpdateStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStatusBtnActionPerformed(evt);
            }
        });
        TableStatus.add(UpdateStatusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 140, 40));

        backTableStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/back btn.png"))); // NOI18N
        backTableStatus.setToolTipText("");
        backTableStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTableStatusMouseClicked(evt);
            }
        });
        TableStatus.add(backTableStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 180, 40));

        statusList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        statusListPane.setViewportView(statusList);

        TableStatus.add(statusListPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 680, -1, 70));

        TableNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableNoActionPerformed(evt);
            }
        });
        TableStatus.add(TableNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 730, 65, -1));

        Background6.setAlignmentY(0.0F);
        TableStatus.add(Background6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Select Status");
        TableStatus.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 80, 20));

        Inventory.setBackground(new java.awt.Color(132, 55, 55));
        Inventory.setAlignmentX(5.0F);
        Inventory.setMaximumSize(new java.awt.Dimension(1024, 768));
        Inventory.setMinimumSize(new java.awt.Dimension(1024, 748));
        Inventory.setPreferredSize(new java.awt.Dimension(1003, 748));
        Inventory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryItemList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryItemList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        inventoryItemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryItemListMouseClicked(evt);
            }
        });
        menuItemListScrollPane1.setViewportView(inventoryItemList);

        Inventory.add(menuItemListScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 210, 250));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Inventory List");
        jLabel25.setToolTipText("");
        Inventory.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        inventoryIdList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryId.setViewportView(inventoryIdList);

        Inventory.add(inventoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 60, 50));

        removeInventoryItemBtn.setText("Remove Item");
        removeInventoryItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeInventoryItemBtnActionPerformed(evt);
            }
        });
        Inventory.add(removeInventoryItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 230, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Name of the Item");
        Inventory.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        jLabel35.setFont(new java.awt.Font("PilGi", 0, 60)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Inventory");
        Inventory.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        inventoryBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/back btn.png"))); // NOI18N
        inventoryBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryBackMouseClicked(evt);
            }
        });
        Inventory.add(inventoryBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        inventoryNameList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryName.setViewportView(inventoryNameList);

        Inventory.add(inventoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 60, 50));

        inventoryStockList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        inventoryStock.setViewportView(inventoryStockList);

        Inventory.add(inventoryStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 60, 50));

        addInventoryAmt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        addInventoryAmt.setText("0");
        addInventoryAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryAmtActionPerformed(evt);
            }
        });
        addInventoryAmt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addInventoryAmtKeyPressed(evt);
            }
        });
        Inventory.add(addInventoryAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 220, -1));
        Inventory.add(addInventoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 220, -1));

        addInventoryItemBtn.setText("Add Item");
        addInventoryItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInventoryItemBtnActionPerformed(evt);
            }
        });
        Inventory.add(addInventoryItemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 230, -1));

        Background8.setAlignmentY(0.0F);
        Inventory.add(Background8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Quantity");
        Inventory.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, 20));

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Add Inventory");
        Inventory.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        orderIDs.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        orderScrollPane.setViewportView(orderIDs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 115, Short.MAX_VALUE)
                    .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 326, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 260, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(OrderManager, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 56, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 127, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 360, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 250, Short.MAX_VALUE)
                    .addComponent(Chef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 250, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 310, Short.MAX_VALUE)
                    .addComponent(Host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 310, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(TableStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 504, Short.MAX_VALUE)
                    .addComponent(orderScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 505, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginAuthentication, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 253, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 174, Short.MAX_VALUE)
                    .addComponent(Manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 189, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addComponent(Emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(OrderManager, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 182, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 95, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 170, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 156, Short.MAX_VALUE)
                    .addComponent(Chef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 156, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 171, Short.MAX_VALUE)
                    .addComponent(Host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 171, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 62, Short.MAX_VALUE)
                    .addComponent(TableStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 63, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 371, Short.MAX_VALUE)
                    .addComponent(orderScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 372, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateOrders()
    {
        ArrayList<ArrayList> orders = OrderManagerController.getOrders();
        DefaultTableModel table = new DefaultTableModel();
        DefaultListModel list = new DefaultListModel();
        
        table.addColumn("Status");
        table.addColumn("Employee Id");
        table.addColumn("Food Ordered");
        table.addColumn("Quantity");
        for(int c = 0; c < orders.size(); c++)
        {
            table.addRow(orders.get(c).toArray());
            list.addElement(orders.get(c).get(4));
        }
        orderTable.setModel(table);
        orderIDs.setModel(list);
    }
    
    private void updateOrders1()
    {
        ArrayList<ArrayList> orders = OrderManagerController.getOrders();
        DefaultTableModel table = new DefaultTableModel();
        DefaultListModel list = new DefaultListModel();
        
        table.addColumn("Status");
        table.addColumn("Employee Id");
        table.addColumn("Food Ordered");
        table.addColumn("Quantity");
        for(int c = 0; c < orders.size(); c++)
        {
            table.addRow(orders.get(c).toArray());
            list.addElement(orders.get(c).get(4));
        }
        jTable1.setModel(table);
        orderIDs.setModel(list);
    }
    
    
    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void updateEmployeeList() 
    {
        ArrayList[] emp = EmpController.updateEmployeeList();
        EmployeeList.setListData(emp[0].toArray());
        EmployeeIdList.setListData(emp[1].toArray());
    }
    
    private void gotoEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoEmpMouseClicked
        Manager.setVisible(false);
        Emp.setVisible(true);
        updateEmployeeList();
        EmpIDScrollPane.setVisible(false);
        
    }//GEN-LAST:event_gotoEmpMouseClicked

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked

        String result[] = MainScreenController.authenticateUser(Username.getText(), Password.getText());
        if(result[0] != null)
        {
            hideAll();
            switch (result[0]) {
                case "Manager":
                    currentType.setText("Manager");
                    Manager.setVisible(true);
                    break;
               case "Host":
                    currentType.setText("Host");
                    Host.setVisible(true);
                    jLabel11.setText("Welcome, Host");
                    break;
                case "Chef":
                    currentType.setText("Chef");
                    Chef.setVisible(true);
                    updateOrders();
                    break;
            }
            currentID.setText(result[1]);
            Msgs.setText("");
        }
        else
        {
            Msgs.setText("<html><br>Login Failed! Please enter a valid username and password.</br></html>");
        }
    }//GEN-LAST:event_LoginMouseClicked
    
    private void selectEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEmpBtnActionPerformed
        
        int id = 0;
        try{
            id = Integer.parseInt(EmployeeIdList.getSelectedValue().toString());  
        }
        catch(Exception e){}
        
        String[] empInfo =  EmpController.getEmployee(id);
        empFirstName.setText(empInfo[0]);
        empMiddleName.setText(empInfo[1]);
        empLastName.setText(empInfo[2]);
        empWage.setText(empInfo[3]);
        empUsername.setText(empInfo[4]);
        empPassword.setText(empInfo[5]);
        empSSN.setText(empInfo[6]);
        empType.setSelectedItem(empInfo[7]); 
        addEmpBtn.setVisible(false);
        clearEmpBtn.setVisible(false);
        editEmpBtn.setVisible(true);
        cancelEmpBtn.setVisible(true);
        removeEmpBtn.setEnabled(false);
        EmployeeList.setEnabled(false);
        selectEmpBtn.setEnabled(false);
    }//GEN-LAST:event_selectEmpBtnActionPerformed

    private void EmployeeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeListMouseClicked
        EmployeeIdList.setSelectedIndex(EmployeeList.getSelectedIndex());
    }//GEN-LAST:event_EmployeeListMouseClicked

    void checkAddEmp()
    {
            addEmpBtn.setEnabled(true);
            editEmpBtn.setEnabled(true);
 
    }
    
    private void addEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpBtnActionPerformed
        EmpController.addEmployee(empFirstName.getText(), 
                empMiddleName.getText(), empLastName.getText(), Long.parseLong(empSSN.getText()), 
                Double.parseDouble(empWage.getText()), empUsername.getText(), empPassword.getText(), 
                empType.getSelectedItem().toString());
        updateEmployeeList();
        clearEmpData();
    }//GEN-LAST:event_addEmpBtnActionPerformed

    private void editEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpBtnActionPerformed
        EmpController.editEmployee(empFirstName.getText(), empMiddleName.getText(), empLastName.getText(), 
                Long.parseLong(empSSN.getText()), Double.parseDouble(empWage.getText()), empUsername.getText(), 
                empPassword.getText(), empType.getSelectedItem().toString(), Integer.parseInt(EmployeeIdList.getSelectedValue().toString()));
        updateEmployeeList();
        clearEmpData();
        addEmpBtn.setVisible(true);
        clearEmpBtn.setVisible(true);
        editEmpBtn.setVisible(false);
        cancelEmpBtn.setVisible(false);
        removeEmpBtn.setEnabled(true);
        EmployeeList.setEnabled(true);
        selectEmpBtn.setEnabled(true);
        //checkAddEmp();
    }//GEN-LAST:event_editEmpBtnActionPerformed

    private void clearEmpData(){
        empFirstName.setText("");
        empMiddleName.setText("");
        empLastName.setText("");
        empSSN.setText(""); 
        empWage.setText("");
        empUsername.setText("");
        empPassword.setText("");
        empType.setSelectedIndex(0);
    }
    
    private void clearEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearEmpBtnActionPerformed
        clearEmpData();
    }//GEN-LAST:event_clearEmpBtnActionPerformed

    private void updateTableNumbers()
    {
        ArrayList[] result = TableStatusController.getTables();
        ArrayList overallTables = new ArrayList();
        TableNo.removeAllItems();
        
        for(int c = 0; c < result[0].size(); c++)
        {
            TableNo.addItem(result[0].get(c));
            overallTables.add(result[0].get(c) + " - " + result[1].get(c));
        }
        createTable();
        ListofTables.setListData(overallTables.toArray());
    }
    
    private void createTable()
    {    

    }
    
    private void gotoTableStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoTableStatusMouseClicked

        Manager.setVisible(false);
        TableStatus.setVisible(true);
        updateStatus();
        updateTableNumbers();
        updateStatusBox();
    }//GEN-LAST:event_gotoTableStatusMouseClicked

    private void updateStatus()
    {
        ArrayList[] result = TableStatusController.getTables();
        statusList.setListData(result[3].toArray());
    }
    
    private void updateMenu()
    {
        ArrayList[] menu = MenuController.getMenuList();
        menuList.setListData(menu[1].toArray());
    }
    
    private void updateMenuDetail()
    {
        try
        {
            if ( menuList.getSelectedValue() != null )
            {
                String selectedFood = menuList.getSelectedValue().toString();
                String[] detail = OrderManagerController.updateMenuDetail(selectedFood);
                foodDetail.setText(selectedFood + " - $" + detail[0] + "\n" + detail[1]);
            }
        }
        catch(Exception e){e.printStackTrace();}
    }
    
    private void updateOrder()
    {
        String[] orders = OrderManagerController.updateOrderList(orderIdList);
        ArrayList temp = new ArrayList();
        int i = 0;
        while(orders[i] != null)
        {
            temp.add(orders[i]);
            i++;
        }
        OrderedList.setListData(temp.toArray());
    }
    
    private void menuListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuListMouseClicked
        if (menuList.getSelectedValue() != null) {
            foodDetail.setVisible(true);
            updateMenuDetail();
        } else {
            foodDetail.setVisible(false);
        }
    }//GEN-LAST:event_menuListMouseClicked

    private void addOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBtnActionPerformed
        if (menuList.isSelectionEmpty() == false && menuList.getSelectedValue() != null) {
            String selectedFood = menuList.getSelectedValue().toString();
            try {
                DefaultListModel orderModel = (DefaultListModel) OrderedList.getModel();
                Object[] orderArray = orderModel.toArray();
                boolean inList = false;
                if (orderArray.length != 0) 
                {
                    int i = 0;
                    while (orderArray.length != i) 
                    {
                        if (orderArray[i].toString().substring(4).equalsIgnoreCase(selectedFood)) {
                            inList = true;
                            break;
                        }
                        i++;
                    }
                }
                if (inList == false) {
                    qtyLabel.setText("# of " + selectedFood + "s?");
                    qtyLabel.setVisible(true);
                    qtySlider.setValue(1);
                    qtySlider.setVisible(true);
                    addQtyBtn.setText("Select Quantity");
                    addQtyBtn.setVisible(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addOrderBtnActionPerformed

    private void OrderedListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderedListMouseClicked
        if (OrderedList.isSelectionEmpty() == false && submitOrderBtn.getText().equalsIgnoreCase("Submit Order")) {
            qtyLabel.setText("# of " + OrderedList.getSelectedValue().toString() + "s");
            qtyLabel.setVisible(true);
            qtySlider.setValue(Integer.parseInt(OrderedList.getSelectedValue().toString().substring(0, 1)));
            qtySlider.setVisible(true);
            addQtyBtn.setText("Change Quantity");
            addQtyBtn.setVisible(true);
        }
    }//GEN-LAST:event_OrderedListMouseClicked

    private void clearOrderListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearOrderListBtnActionPerformed
        try {
            DefaultListModel orderModel = (DefaultListModel) OrderedList.getModel();
            if (orderModel.toArray().length != 0) {
                orderModel.clear();
            }
            qtyLabel.setVisible(false);
            qtySlider.setVisible(false);
            addQtyBtn.setVisible(false);
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_clearOrderListBtnActionPerformed

    private void submitOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitOrderBtnActionPerformed
        DefaultListModel orderModel = (DefaultListModel) OrderedList.getModel();
        if (submitOrderBtn.getText().equalsIgnoreCase("Submit Order")) {
            OrderManagerController.submitOrder(orderModel.toArray(), orderIdList, Integer.parseInt(currentID.getText()));
            submitOrderBtn.setText("Cancel Selected Orders");
            removeOrderBtn.setVisible(false);
            clearOrderListBtn.setVisible(false);
        } else {
            OrderManagerController.cancelOrder(OrderedList, orderIdList);
            updateOrder();
       
        }
    }//GEN-LAST:event_submitOrderBtnActionPerformed

    private void removeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeOrderBtnActionPerformed
        try {
            DefaultListModel orderModel = (DefaultListModel) OrderedList.getModel();
            if (orderModel.getSize() != 0) {
                orderModel.removeElement(OrderedList.getSelectedValue());
            }
            qtyLabel.setVisible(false);
            qtySlider.setVisible(false);
            addQtyBtn.setVisible(false);
        } catch (Exception e) {
        }
  
    }//GEN-LAST:event_removeOrderBtnActionPerformed

    private void addQtyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQtyBtnActionPerformed
        int qty = qtySlider.getValue();
        String buttonText = addQtyBtn.getText();
        qtyLabel.setVisible(false);
        qtySlider.setVisible(false);
        addQtyBtn.setVisible(false);
        OrderManagerController.updateQuantity(OrderedList, menuList.getSelectedValue().toString(), qty, buttonText);
      
    }//GEN-LAST:event_addQtyBtnActionPerformed

    private void gotoOrderingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoOrderingMouseClicked
        Manager.setVisible(false);
        OrderManager.setVisible(true);
        foodDetail.setVisible(false);
        qtyLabel.setVisible(false);
        qtySlider.setVisible(false);
        addQtyBtn.setVisible(false);
        orderIdPane.setVisible(true);
        updateMenu();
        updateOrders1();
    }//GEN-LAST:event_gotoOrderingMouseClicked

    void updateMenuList()
    {
        ArrayList[] data = MenuController.getMenuList();
        ArrayList[] inventory = InventoryController.getInventoryList();
        menuItemList.setListData(data[1].toArray());
        menuIdList.setListData(data[0].toArray());
        DefaultComboBoxModel temp = new DefaultComboBoxModel();
        for(int c = 0; c < inventory[1].size(); c++)
        {
            temp.addElement(inventory[1].get(c));
        }
        inventoryMenuList.setListData(inventory[0].toArray());
    }
    
    private void gotoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoMenuMouseClicked
        Manager.setVisible(false);
        Menu.setVisible(true);
        idMenuList.setVisible(false);
        updateMenuItemBtn.setVisible(false);
        editMenuCancelBtn.setVisible(false);
        updateMenuList();
    }//GEN-LAST:event_gotoMenuMouseClicked

    void updateMenuInfo(Integer id)
    {
        if (id == null) {
            menuItemDescription.setText("");
        } else {
            String[] data = MenuController.updateMenuDetails(id);
            menuItemDescription.setText(menuItemList.getSelectedValue().toString() + " - $" + data[0] + "\n" + data[1]);
        }
    }
    private void backEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backEmpMouseClicked
        goBack();
    }//GEN-LAST:event_backEmpMouseClicked

    private void logoutManagerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutManagerBtnMouseClicked
        Manager.setVisible(false);
        LoginAuthentication.setVisible(true);
        Username.setText("");
        Password.setText("");
    }//GEN-LAST:event_logoutManagerBtnMouseClicked

    private void updateMenuItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuItemBtnActionPerformed

        Integer id = Integer.parseInt(menuIdList.getSelectedValue().toString());
        String foodName = menuItemName.getText();
        String price = ItemPrice.getText();
        String description = addMenuItemDes.getText();
        String additional = "";

        MenuController.editMenu(id, foodName, price, description);
        updateMenuItemBtn.setVisible(false);
        editMenuCancelBtn.setVisible(false);
        addMenuItem.setVisible(true);
        clearMenuInsert.setVisible(true);
        removeMenuItemBtn.setEnabled(true);
        menuItemList.setEnabled(true);
        clearEditMenuItem();
        checkMenuAddItem();
        updateMenuInfo(id);
    }//GEN-LAST:event_updateMenuItemBtnActionPerformed

    private void editMenuCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuCancelBtnActionPerformed
        updateMenuItemBtn.setVisible(false);
        editMenuCancelBtn.setVisible(false);
        addMenuItem.setVisible(true);
        clearMenuInsert.setVisible(true);
        menuItemList.setEnabled(true);
        removeMenuItemBtn.setEnabled(true);
        clearEditMenuItem();
    }//GEN-LAST:event_editMenuCancelBtnActionPerformed

    private void removeMenuItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuItemBtnActionPerformed
        Integer id = Integer.parseInt(menuIdList.getSelectedValue().toString());
        if (id != null) {
            MenuController.removeMenu(id);
            updateMenuList();
        }
        updateMenuInfo(null);
    }//GEN-LAST:event_removeMenuItemBtnActionPerformed

    private void clearMenuInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuInsertActionPerformed
        clearEditMenuItem();
        checkMenuAddItem();
    }//GEN-LAST:event_clearMenuInsertActionPerformed

    private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemActionPerformed
String foodName = menuItemName.getText();
        String price = ItemPrice.getText();
        String description = addMenuItemDes.getText();
        ListModel i =  inventoryMenuList.getModel();     
        MenuController.addMenu(foodName, price, description);
        clearEditMenuItem();
        updateMenuList();
    }//GEN-LAST:event_addMenuItemActionPerformed

    private void editMenuItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuItemBtnActionPerformed
        menuIdList.setSelectedIndex(menuItemList.getSelectedIndex());
        Integer id = Integer.parseInt(menuIdList.getSelectedValue().toString());
        if (id != null) {
            String[] data = MenuController.updateMenuDetails(id);
            addMenuItemDes.setText(data[1]);
            ItemPrice.setText(data[0]);
            menuItemName.setText(menuItemList.getSelectedValue().toString());
            if (data[2] == null) {
               
            } else {
                String[] additions = data[2].split(",");
                DefaultListModel temp = new DefaultListModel();
                for (int c = 0; c < additions.length; c++) {
                    temp.addElement(additions[c]);
                }
            }
            updateMenuItemBtn.setVisible(true);
            editMenuCancelBtn.setVisible(true);
            addMenuItem.setVisible(false);
            clearMenuInsert.setVisible(false);
            menuItemList.setEnabled(false);
            removeMenuItemBtn.setEnabled(false);
            checkMenuAddItem();
        }
    }//GEN-LAST:event_editMenuItemBtnActionPerformed

    private void menuItemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemListMouseClicked
        menuIdList.setSelectedIndex(menuItemList.getSelectedIndex());
        Integer id = Integer.parseInt(menuIdList.getSelectedValue().toString());
        updateMenuInfo(id);
    }//GEN-LAST:event_menuItemListMouseClicked

    void checkMenuAddItem()
    {
        if("".equals(menuItemName.getText()) || "".equals(ItemPrice.getText()) || "".equals(addMenuItemDes.getText()))
        {
            addMenuItem.setEnabled(false);
            updateMenuItemBtn.setEnabled(false);
        }
        else
        {
            addMenuItem.setEnabled(true);
            updateMenuItemBtn.setEnabled(true);
        }
    }
    
    private void menuItemNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemNameKeyTyped
        checkMenuAddItem();
    }//GEN-LAST:event_menuItemNameKeyTyped

    private void menuItemNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuItemNameKeyReleased
        checkMenuAddItem();
    }//GEN-LAST:event_menuItemNameKeyReleased

    private void ItemPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemPriceKeyTyped
        checkMenuAddItem();
    }//GEN-LAST:event_ItemPriceKeyTyped

    private void ItemPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemPriceKeyReleased
        checkMenuAddItem();
    }//GEN-LAST:event_ItemPriceKeyReleased

    private void addMenuItemDesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addMenuItemDesKeyTyped
        checkMenuAddItem();
    }//GEN-LAST:event_addMenuItemDesKeyTyped

    private void addMenuItemDesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addMenuItemDesKeyReleased
        checkMenuAddItem();
    }//GEN-LAST:event_addMenuItemDesKeyReleased

    private void LogOutChefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutChefMouseClicked
        hideAll();
        LoginAuthentication.setVisible(true);
    }//GEN-LAST:event_LogOutChefMouseClicked

    private void gotoTableStatusLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoTableStatusLabelMouseClicked
        Host.setVisible(false);
        TableStatus.setVisible(true);
        updateStatus();
        updateTableNumbers();
        updateStatusBox();
    }//GEN-LAST:event_gotoTableStatusLabelMouseClicked

    private void LogOutHostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutHostMouseClicked
        hideAll();
        LoginAuthentication.setVisible(true);
    }//GEN-LAST:event_LogOutHostMouseClicked

    private void orderBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderBackMouseClicked
        goBack();
    }//GEN-LAST:event_orderBackMouseClicked

    private void menuBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBackMouseClicked
        goBack();
    }//GEN-LAST:event_menuBackMouseClicked

    private void cancelEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEmpBtnActionPerformed
        clearEmpData();
        addEmpBtn.setVisible(true);
        clearEmpBtn.setVisible(true);
        editEmpBtn.setVisible(false);
        cancelEmpBtn.setVisible(false);
        removeEmpBtn.setEnabled(true);
        EmployeeList.setEnabled(true);
        selectEmpBtn.setEnabled(true);
        checkAddEmp();
    }//GEN-LAST:event_cancelEmpBtnActionPerformed

    private void removeEmpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEmpBtnActionPerformed
        //JOptionPane.showMessageDialog(this,"Under Contrsuction!");
        try {
            EmpController.deleteEmployee(Integer.parseInt(EmployeeIdList.getSelectedValue().toString()));
            updateEmployeeList();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_removeEmpBtnActionPerformed

    private void empFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empFirstNameKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empFirstNameKeyReleased

    private void empFirstNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empFirstNameKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empFirstNameKeyPressed

    private void empMiddleNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empMiddleNameKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empMiddleNameKeyPressed

    private void empMiddleNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empMiddleNameKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empMiddleNameKeyReleased

    private void empLastNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empLastNameKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empLastNameKeyPressed

    private void empLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empLastNameKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empLastNameKeyReleased

    private void empSSNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empSSNKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empSSNKeyPressed

    private void empSSNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empSSNKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empSSNKeyReleased

    private void empWageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empWageKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empWageKeyPressed

    private void empWageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empWageKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empWageKeyReleased

    private void empUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empUsernameKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empUsernameKeyPressed

    private void empUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empUsernameKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empUsernameKeyReleased

    private void empPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empPasswordKeyPressed
        checkAddEmp();
    }//GEN-LAST:event_empPasswordKeyPressed

    private void empPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_empPasswordKeyReleased
        checkAddEmp();
    }//GEN-LAST:event_empPasswordKeyReleased

    private void empTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empTypeActionPerformed
        checkAddEmp();
    }//GEN-LAST:event_empTypeActionPerformed

    private void ListofTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListofTablesMouseClicked
        TableNo.setSelectedIndex(ListofTables.getSelectedIndex());
        updateTableNumber();
        updateStatusBox();
    }//GEN-LAST:event_ListofTablesMouseClicked

    private void UpdateStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStatusBtnActionPerformed
        try{
           TableStatusController.updateStatus(Integer.parseInt(TableNo.getSelectedItem().toString()), TableStatusBox.getSelectedItem().toString());
        }
        catch(Exception e){}
        finally
        {
            updateTableNumbers();
            updateStatusBox();
            updateStatus(); 
        }
        
    }//GEN-LAST:event_UpdateStatusBtnActionPerformed

    private void backTableStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTableStatusMouseClicked
        goBack();
    }//GEN-LAST:event_backTableStatusMouseClicked

    private void TableNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TableNoActionPerformed

    void updateInventoryList()
    {
        ArrayList[] data = InventoryController.getInventoryList();
        ArrayList temp = new ArrayList();
        data[0].size();
        for(int c = 0; c < data[0].size(); c++)
        {
            temp.add(data[1].get(c) + " - " + data[2].get(c) + " Units");
        }
        inventoryItemList.setListData(temp.toArray());
        inventoryIdList.setListData(data[0].toArray());
        inventoryNameList.setListData(data[1].toArray());
        inventoryStockList.setListData(data[2].toArray());
        
    }
    
    private void gotoInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoInventoryMouseClicked
        Manager.setVisible(false);
        Inventory.setVisible(true);
        inventoryId.setVisible(false);
        inventoryName.setVisible(false);
        inventoryStock.setVisible(false);
        updateInventoryList();
        
    }//GEN-LAST:event_gotoInventoryMouseClicked


    void updateAddStockInfo()
    {
        Integer stock = Integer.parseInt(inventoryStockList.getSelectedValue().toString()) + Integer.parseInt(addInventoryAmt.getText());

    }
    
    void updateRemovetStockInfo()
    {
    }
    
    private void inventoryItemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryItemListMouseClicked
        inventoryIdList.setSelectedIndex(inventoryItemList.getSelectedIndex());
        inventoryNameList.setSelectedIndex(inventoryItemList.getSelectedIndex());
        inventoryStockList.setSelectedIndex(inventoryItemList.getSelectedIndex());
        addInventoryAmt.setText("0");      
        String stock = inventoryStockList.getSelectedValue().toString();
    }//GEN-LAST:event_inventoryItemListMouseClicked

    private void removeInventoryItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeInventoryItemBtnActionPerformed
        InventoryController.removeInventory(Integer.parseInt(inventoryIdList.getSelectedValue().toString()));
        updateInventoryList();
        addInventoryAmt.setText("0");
    }//GEN-LAST:event_removeInventoryItemBtnActionPerformed

    private void inventoryBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryBackMouseClicked
        goBack();
    }//GEN-LAST:event_inventoryBackMouseClicked

    private void addInventoryAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryAmtActionPerformed
        updateAddStockInfo();
    }//GEN-LAST:event_addInventoryAmtActionPerformed

    private void addInventoryItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInventoryItemBtnActionPerformed
        InventoryController.addInventory(addInventoryName.getText(), addInventoryAmt.getText());
        updateInventoryList();
        addInventoryName.setText("");
        addInventoryAmt.setText("0");
    }//GEN-LAST:event_addInventoryItemBtnActionPerformed

    private void addInventoryAmtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addInventoryAmtKeyPressed
  
    }//GEN-LAST:event_addInventoryAmtKeyPressed
  
    private void updateOrderStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrderStatusBtnActionPerformed
        try{
            int row = orderTable.getSelectedRow();
            DefaultTableModel table = (DefaultTableModel)orderTable.getModel();
           Vector<Vector> data = table.getDataVector();
            String currStatus = data.get(row).get(0).toString();
            switch (currStatus) {
                case "Pending":
                    OrderManagerController.updateStatus(row+1, 0);
                    break;
                case "Preparing":
                    OrderManagerController.updateStatus(row+1, 1);
                    break;
                case "Cooking":
                    OrderManagerController.updateStatus(row+1, 2);
                    break;
                case "Done":
                    OrderManagerController.updateStatus(row+1, 3);
                    break;
            }
            updateOrders();
        }
        catch(Exception e){}
    }//GEN-LAST:event_updateOrderStatusBtnActionPerformed

    private void gotoTableStatus1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoTableStatus1MouseClicked
        Host.setVisible(false);
        TableStatus.setVisible(true);
        updateStatus();
        updateTableNumbers();
        updateStatusBox();
    }//GEN-LAST:event_gotoTableStatus1MouseClicked

    private void empPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPasswordActionPerformed

    }//GEN-LAST:event_empPasswordActionPerformed

    private void orderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderTableMouseClicked
    try
        {
            orderIDs.setSelectedIndex(orderTable.getSelectedRow());
        }
        catch(Exception e){}
    }//GEN-LAST:event_orderTableMouseClicked

    private void addMenuItemDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemDesActionPerformed
        
    }//GEN-LAST:event_addMenuItemDesActionPerformed

    void updateStatusBox()
    {
        statusList.setSelectedIndex(ListofTables.getSelectedIndex());
        TableStatusBox.setSelectedItem(statusList.getSelectedValue());
    }
    
    void updateTableNumber()
    {
        TableNo.setSelectedIndex(ListofTables.getSelectedIndex());
    }
    
    void clearEditMenuItem()
    {
        menuItemName.setText("");
        addMenuItemDes.setText("");
        ItemPrice.setText("");
    }
    
    public void hideAll()
    {
        Manager.setVisible(false);
        Emp.setVisible(false);
        TableStatus.setVisible(false);
        OrderManager.setVisible(false);
        Menu.setVisible(false);
        Host.setVisible(false);
        Chef.setVisible(false);
        LoginAuthentication.setVisible(false);
        Inventory.setVisible(false);
        orderScrollPane.setVisible(false);
    }
    
    public void begin()
    {
        LoginAuthentication.setVisible(true);
        currentID.setVisible(false);
        currentType.setVisible(false);
        EmpIDScrollPane.setVisible(false);
        Msgs.setText("");
        statusListPane.setVisible(false);
        TableNo.setVisible(false);
        orderIdPane.setVisible(false);
        orderIdList.setVisible(false);
        additionId.setVisible(false);
        inventoryMenu.setVisible(false);
        
    }
    
    void goBack()
    {
        hideAll();
        String type = currentType.getText();
        switch (type) {
            case "Manager":
                Manager.setVisible(true);
                break;   
            case "Host":
                Host.setVisible(true);
                break;
            case "Chef":
                Chef.setVisible(true);
                break;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel Background3;
    private javax.swing.JLabel Background5;
    private javax.swing.JLabel Background6;
    private javax.swing.JLabel Background7;
    private javax.swing.JLabel Background8;
    private javax.swing.JPanel Chef;
    private javax.swing.JPanel Emp;
    private javax.swing.JScrollPane EmpIDScrollPane;
    private javax.swing.JScrollPane EmpScollPane;
    private javax.swing.JList EmployeeIdList;
    private javax.swing.JList EmployeeList;
    private javax.swing.JPanel Host;
    private javax.swing.JPanel Inventory;
    private javax.swing.JFormattedTextField ItemPrice;
    private javax.swing.JList ListofTables;
    private javax.swing.JLabel LogOutChef;
    private javax.swing.JLabel LogOutHost;
    private javax.swing.JLabel Login;
    private javax.swing.JPanel LoginAuthentication;
    private javax.swing.JPanel Manager;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Msgs;
    private javax.swing.JPanel OrderManager;
    private javax.swing.JList OrderedList;
    private javax.swing.JPasswordField Password;
    private javax.swing.JComboBox TableNo;
    private javax.swing.JPanel TableStatus;
    private javax.swing.JComboBox TableStatusBox;
    private javax.swing.JButton UpdateStatusBtn;
    private javax.swing.JTextField Username;
    private javax.swing.JButton addEmpBtn;
    private javax.swing.JFormattedTextField addInventoryAmt;
    private javax.swing.JButton addInventoryItemBtn;
    private javax.swing.JTextField addInventoryName;
    private javax.swing.JButton addMenuItem;
    private javax.swing.JTextField addMenuItemDes;
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JButton addQtyBtn;
    private javax.swing.JScrollPane additionId;
    private javax.swing.JList additionIdList;
    private javax.swing.JLabel backEmp;
    private javax.swing.JLabel backTableStatus;
    private javax.swing.JLabel backgroundChef;
    private javax.swing.JButton cancelEmpBtn;
    private javax.swing.JButton clearEmpBtn;
    private javax.swing.JButton clearMenuInsert;
    private javax.swing.JButton clearOrderListBtn;
    private javax.swing.JTextField currentID;
    private javax.swing.JTextField currentType;
    private javax.swing.JButton editEmpBtn;
    private javax.swing.JButton editMenuCancelBtn;
    private javax.swing.JButton editMenuItemBtn;
    private javax.swing.JTextField empFirstName;
    private javax.swing.JTextField empLastName;
    private javax.swing.JTextField empMiddleName;
    private javax.swing.JTextField empPassword;
    private javax.swing.JFormattedTextField empSSN;
    private javax.swing.JComboBox empType;
    private javax.swing.JTextField empUsername;
    private javax.swing.JFormattedTextField empWage;
    private javax.swing.JTextArea foodDetail;
    private javax.swing.JScrollPane foodDetails;
    private javax.swing.JLabel gotoEmp;
    private javax.swing.JLabel gotoInventory;
    private javax.swing.JLabel gotoMenu;
    private javax.swing.JLabel gotoOrdering;
    private javax.swing.JLabel gotoTableStatus;
    private javax.swing.JLabel gotoTableStatus1;
    private javax.swing.JLabel gotoTableStatusLabel;
    private javax.swing.JScrollPane idMenuList;
    private javax.swing.JLabel inventoryBack;
    private javax.swing.JScrollPane inventoryId;
    private javax.swing.JList inventoryIdList;
    private javax.swing.JList inventoryItemList;
    private javax.swing.JScrollPane inventoryMenu;
    private javax.swing.JList inventoryMenuList;
    private javax.swing.JScrollPane inventoryName;
    private javax.swing.JList inventoryNameList;
    private javax.swing.JScrollPane inventoryStock;
    private javax.swing.JList inventoryStockList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoutManagerBtn;
    private javax.swing.JLabel menuBack;
    private javax.swing.JList menuIdList;
    private javax.swing.JScrollPane menuItemDes;
    private javax.swing.JTextPane menuItemDescription;
    private javax.swing.JList menuItemList;
    private javax.swing.JScrollPane menuItemListScrollPane1;
    private javax.swing.JTextField menuItemName;
    private javax.swing.JScrollPane menuItemsList;
    private javax.swing.JList menuList;
    private javax.swing.JLabel orderBack;
    private javax.swing.JList orderIDs;
    private javax.swing.JList orderIdList;
    private javax.swing.JScrollPane orderIdPane;
    private javax.swing.JScrollPane orderScrollPane;
    private javax.swing.JTable orderTable;
    private javax.swing.JTextField qtyLabel;
    private javax.swing.JSlider qtySlider;
    private javax.swing.JButton removeEmpBtn;
    private javax.swing.JButton removeInventoryItemBtn;
    private javax.swing.JButton removeMenuItemBtn;
    private javax.swing.JButton removeOrderBtn;
    private javax.swing.JButton selectEmpBtn;
    private javax.swing.JList statusList;
    private javax.swing.JScrollPane statusListPane;
    private javax.swing.JButton submitOrderBtn;
    private javax.swing.JButton updateMenuItemBtn;
    private javax.swing.JButton updateOrderStatusBtn;
    // End of variables declaration//GEN-END:variables
}
