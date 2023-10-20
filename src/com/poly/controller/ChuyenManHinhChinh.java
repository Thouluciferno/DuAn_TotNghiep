/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.controller;

import com.poly.bean.MenuBean;
import com.poly.model.Trangchu;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Nhu Y
 */
public class ChuyenManHinhChinh {
    private JPanel pnlView;
    private String kindSelected = "";
    
    public ChuyenManHinhChinh (JPanel pnlView) {
        this.pnlView = pnlView;
    }

    public void setDashboard(JPanel pnlItem, JLabel lblItem) {
        kindSelected = "TrangChinh";
        JPanel node = new Trangchu();
        pnlView.removeAll();
        pnlView.validate();
        pnlView.repaint();
        pnlView.setLayout(new BorderLayout());
        pnlView.add(node);
        pnlView.validate();
        pnlView.repaint();
    }
    
//    public void setEvent(List<DanhMucBean> listDanhMuc) {
//        for (DanhMucBean item : listDanhMuc) {
//            item.getLbl().addMouseListener(new LabelEvent(item.getKind(), item.getPnl(), item.getLbl()));
//        }
//
//    }

//    public class LabelEvent implements MouseListener {
//
//        private JPanel node;
//        private String kind;
//
//        private JPanel pnlItem;
//        private JLabel lblItem;
//
//        public LabelEvent(String kind, JPanel pnlItem, JLabel lblItem) {
//            this.kind = kind;
//            this.pnlItem = pnlItem;
//            this.lblItem = lblItem;
//        }
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            switch (kind) {
//                case "TrangChu":
//                    node = new TrangChuJPanel();
//                    break;
//                case "HocVien":
//                    node = new HocVienJPanel();
//                    break;
//                case "KhoaHoc":
//                    node = new KhoaHocJPanel();
//                    break;
//                case "LichHoc":
//                    node = new LichHocJPanel();
//                    break;
//                case "LichDay":
//                    node = new LichDayJPanel();
//                    break;
//                case "DiemDanh":
//                    node = new DiemDanhJPanel();
//                    break;
//                case "GiaoVien":
//                    node = new GiaoVienJPanel();
//                    break;
//                case "ThongKe":
//                    node = new ThongKeJPanel();
//                    break;
//                // more
//                default:
//                    break;
//            }
//            pnlView.removeAll();
//            pnlView.validate();
//            pnlView.repaint();
//            pnlView.setLayout(new BorderLayout());
//            pnlView.add(node);
//            pnlView.validate();
//            pnlView.repaint();
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            kindSelected = kind;
//            pnlItem.setBackground(Color.white);
//            lblItem.setBackground(Color.white);
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent e) {
//
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent e) {
//            pnlItem.setBackground(Color.white);
//            lblItem.setBackground(Color.white);
//        }
//
//        @Override
//        public void mouseExited(MouseEvent e) {
//            if (!kindSelected.equalsIgnoreCase(kind)) {
//                pnlItem.setBackground(new Color(255, 255, 204));
//                lblItem.setBackground(new Color(255, 255, 204));
//            }
//        }
//
//    }

  public void setEventMenu(List<MenuBean> listMenu) {
        for (MenuBean item : listMenu) {
            item.getMnu().addActionListener(new MenuEvent(item.getKind(), item.getMnu()));
        }
    }

    public void setDashBoaed(JPanel pnlItem) {
        kindSelected = "TrangChu";
        JPanel node = new Trangchu();
        pnlView.removeAll();
        pnlView.validate();
        pnlView.repaint();
        pnlView.setLayout(new BorderLayout());
        pnlView.add(node);
        pnlView.validate();
        pnlView.repaint();
    }

    public void setViews(JPanel node) {
        pnlView.removeAll();
        pnlView.validate();
        pnlView.repaint();
        pnlView.setLayout(new BorderLayout());
        pnlView.add(node);
        pnlView.validate();
        pnlView.repaint();
    }


    public class MenuEvent implements ActionListener {

        private JPanel node;
        private String kind;
        private JMenuItem mnuItem;
        private Trangchu none;

        public MenuEvent(String kind, JMenuItem mnuItem) {
            this.kind = kind;
            this.mnuItem = mnuItem;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (kind) {
                case "ManHinhChinh":
                   none = new Trangchu();
                    break;
//                case "Diem":
//                  node = new BangDiemJPanel();
//            setViews(node);
////                break;
//                case "DiemDanh":
//                  node = new DiemDanhJPanel();
//            setViews(node);
//                  break;
//                case "KhoaHoc":
//                  node = new KhoaHocJPanel();
//                    setViews(node);
//                    break;
//                  case "MonHoc":
//                    node = new MonHocJPanel();
//                    setViews(node);
//                    break;
//                case "CaHoc":
//                    node = new CaHocJPanel();
//                    setViews(node);
//                  break;
//              case "HocVien":
//                  node = new HocVienJPanel();
//                    setViews(node);
//                    break;
//                case "LopHoc":
//                    node = new LopHocJPanel();
//                    setViews(node);
//                    break;
//                case "LichThi":
//                    node = new LichThiJPanel();
//                    setViews(node);
//                    break;
//                    case "LichDay":
//                    node = new LichDayJPanel();
//                    setViews(node);
//                    break;
//                case "ThongKe":
//                    node = new ThongKeJPanel();
//                    setViews(node);
//                  break;
//                case "LichHoc":
//                    node = new LichHocJPanel();
//                    setViews(node);
//                    break;
//                case "DienGiamPhi":
//                    node = new DienGiamPhiJPanel();
//                    setViews(node);
//                    break;
//                default:
//                    node = new Trangchu();
//                    setViews(node);
//                    break;
            }
        }

    }
    }

