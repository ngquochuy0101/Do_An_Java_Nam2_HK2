-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 21, 2024 lúc 06:07 AM
-- Phiên bản máy phục vụ: 10.4.32-MariaDB
-- Phiên bản PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlsieuthimini`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietchuongtrinhgiamgia`
--

CREATE TABLE `chitietchuongtrinhgiamgia` (
  `idChiTietChuongTrinhGiamGia` int(11) NOT NULL,
  `loaiGiam` int(11) DEFAULT NULL,
  `soTienGiam` int(11) DEFAULT NULL,
  `phanTramGiam` int(11) NOT NULL,
  `idChuongTrinh` int(11) DEFAULT NULL,
  `idSanPham` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietchuongtrinhgiamgia`
--

INSERT INTO `chitietchuongtrinhgiamgia` (`idChiTietChuongTrinhGiamGia`, `loaiGiam`, `soTienGiam`, `phanTramGiam`, `idChuongTrinh`, `idSanPham`) VALUES
(1, 1, 1000, 0, 1, 1),
(2, 2, 0, 10, 2, 2),
(16, 1, 1, 0, 19, 11);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitiethoadon`
--

CREATE TABLE `chitiethoadon` (
  `idChiTietHoaDon` int(11) NOT NULL,
  `donGia` int(11) DEFAULT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `thanhTien` int(11) DEFAULT NULL,
  `idHoaDon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitiethoadon`
--

INSERT INTO `chitiethoadon` (`idChiTietHoaDon`, `donGia`, `soLuong`, `thanhTien`, `idHoaDon`) VALUES
(2, 60000, 5, 300000, 1),
(3, 55000, 8, 440000, 2),
(4, 70000, 12, 840000, 2),
(5, 60000, 7, 420000, 3),
(6, 50000, 9, 450000, 3),
(7, 70000, 11, 770000, 4),
(8, 60000, 6, 360000, 4),
(9, 55000, 8, 440000, 5),
(10, 70000, 10, 700000, 5),
(11, 10000, 2, 20000, 1),
(12, 10000, 2, 20000, 1),
(29, 60000, 5, 300000, 19),
(30, 10000, 2, 20000, 1),
(31, 5000, 1, 5000, 21),
(32, 5000, 1, 5000, 22),
(33, 5000, 1, 5000, 22),
(34, 7000, 1, 7000, 22),
(35, 13123, 1, 13123, 23),
(36, 5000, 1, 5000, 24),
(37, 7000, 1, 7000, 24),
(38, 6000, 1, 6000, 24),
(39, 5000, 1, 5000, 25),
(40, 7000, 1, 7000, 25),
(41, 5000, 1, 5000, 26),
(42, 5000, 1, 5000, 27),
(43, 5000, 1, 5000, 28),
(44, 7000, 1, 7000, 28),
(45, 5000, 1, 5000, 29),
(46, 6500, 1, 6500, 30),
(47, 7500, 1, 7500, 31),
(48, 13123, 1, 13123, 32),
(49, 6500, 1, 6500, 33),
(50, 8000, 1, 8000, 34),
(51, 6500, 1, 6500, 35),
(52, 6000, 1, 6000, 36),
(53, 8000, 1, 8000, 37),
(54, 5000, 1, 5000, 37),
(55, 7000, 1, 7000, 38),
(56, 7500, 1, 7500, 38),
(57, 100000, 1, 100000, 38),
(58, 7500, 1, 7500, 39),
(59, 9000, 1, 9000, 39),
(60, 6000, 1, 6000, 39),
(61, 100000, 1, 100000, 40),
(62, 6000, 1, 6000, 40),
(63, 6000, 1, 6000, 41),
(64, 13123, 1, 13123, 41),
(65, 6500, 1, 6500, 41),
(66, 7500, 1, 7500, 41),
(67, 6000, 1, 6000, 41),
(68, 8000, 1, 8000, 41),
(69, 7000, 1, 7000, 41),
(70, 9000, 1, 9000, 41),
(71, 100000, 1, 100000, 41),
(72, 10, 1, 10, 41),
(73, 5000, 1, 5000, 42),
(74, 7000, 1, 7000, 42),
(75, 6000, 1, 6000, 42),
(76, 13123, 1, 13123, 42),
(77, 6500, 1, 6500, 42),
(78, 5000, 1, 5000, 43),
(79, 7000, 1, 7000, 43),
(80, 6000, 1, 6000, 43),
(81, 13123, 1, 13123, 43),
(82, 6500, 1, 6500, 43),
(83, 7500, 1, 7500, 43),
(84, 6000, 1, 6000, 43),
(85, 8000, 1, 8000, 43),
(86, 7000, 1, 7000, 43),
(87, 9000, 1, 9000, 43),
(88, 5000, 1, 5000, 44),
(89, 7000, 1, 7000, 44),
(90, 6000, 1, 6000, 44),
(91, 13123, 1, 13123, 44),
(92, 6500, 1, 6500, 44),
(93, 7500, 1, 7500, 44),
(94, 6000, 1, 6000, 44),
(95, 8000, 1, 8000, 44),
(96, 5000, 1, 5000, 45),
(97, 7000, 1, 7000, 45),
(98, 6000, 1, 6000, 45),
(99, 13123, 1, 13123, 45),
(100, 6500, 1, 6500, 45),
(101, 5000, 1, 5000, 46),
(102, 7000, 1, 7000, 46),
(103, 6000, 1, 6000, 46),
(104, 5000, 1, 5000, 47),
(105, 5000, 1, 5000, 48),
(106, 7000, 1, 7000, 48),
(107, 6000, 1, 6000, 48),
(108, 13123, 1, 13123, 48),
(109, 6500, 1, 6500, 48),
(110, 7500, 1, 7500, 48),
(111, 6000, 1, 6000, 48),
(112, 8000, 1, 8000, 48),
(113, 7000, 1, 7000, 48),
(114, 9000, 1, 9000, 48);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `idChiTietPhieuNhap` int(11) NOT NULL,
  `soLuong` int(11) DEFAULT NULL,
  `donGiaSP` int(11) DEFAULT NULL,
  `thanhTien` int(11) DEFAULT NULL,
  `idPhieuNhap` int(11) DEFAULT NULL,
  `idSP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`idChiTietPhieuNhap`, `soLuong`, `donGiaSP`, `thanhTien`, `idPhieuNhap`, `idSP`) VALUES
(1, 10, 50000, 500000, 1, 1),
(2, 5, 60000, 300000, 1, 2),
(3, 8, 55000, 440000, 2, 3),
(4, 12, 70000, 840000, 2, 4),
(5, 7, 60000, 420000, 3, 5),
(6, 9, 50000, 450000, 3, 6),
(7, 11, 70000, 770000, 4, 7),
(8, 6, 60000, 360000, 4, 8),
(9, 8, 55000, 440000, 5, 9),
(10, 10, 70000, 700000, 5, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chitietsp`
--

CREATE TABLE `chitietsp` (
  `idChiTietSP` int(11) NOT NULL,
  `doNgot` int(11) DEFAULT NULL,
  `hinhDang` varchar(50) DEFAULT NULL,
  `huong` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietsp`
--

INSERT INTO `chitietsp` (`idChiTietSP`, `doNgot`, `hinhDang`, `huong`) VALUES
(1, 5, 'Tròn', 'Hương Vani'),
(2, 3, 'Vuông', 'Hương Dâu'),
(3, 2, 'Tròn', 'Hương Vani'),
(4, 4, 'Vuông', 'Hương Dâu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chuongtrinhgiamgia`
--

CREATE TABLE `chuongtrinhgiamgia` (
  `idChuongTrinh` int(11) NOT NULL,
  `ten` varchar(255) DEFAULT NULL,
  `start` varchar(255) DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `chuongtrinhgiamgia`
--

INSERT INTO `chuongtrinhgiamgia` (`idChuongTrinh`, `ten`, `start`, `end`) VALUES
(1, 'Chương trình 1 ', '2024-05-11', '2024-05-22'),
(2, 'Chương trình 2', '2002-12-22', '2002-12-22'),
(4, 'Chương trình 4', '2024-04-01', '2024-04-30'),
(5, 'Chương trình 5', '2024-05-01', '2024-05-31'),
(6, 'Chương trình 6', '2024-06-01', '2024-06-30'),
(7, 'Chương trình 7', '2024-07-01', '2024-07-31'),
(8, 'Chương trình 8', '2024-08-01', '2024-08-31'),
(9, 'Chương trình 9', '2024-09-01', '2024-09-30'),
(10, 'Chương trình 10', '2024-10-01', '2024-10-31');


-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoadon`
--

CREATE TABLE `hoadon` (
  `idHoaDon` int(11) NOT NULL,
  `tongTien` int(11) DEFAULT NULL,
  `tienGiamGia` int(11) DEFAULT NULL,
  `ngayLap` datetime DEFAULT NULL,
  `idNhanVien` int(11) DEFAULT NULL,
  `idKhachHang` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `hoadon`
--

INSERT INTO `hoadon` (`idHoaDon`, `tongTien`, `tienGiamGia`, `ngayLap`, `idNhanVien`, `idKhachHang`) VALUES
(1, 2000, 100, '2024-01-01 10:00:00', 1, 1),
(2, 600000, 20000, '2024-01-02 11:00:00', 2, 2),
(3, 550000, 0, '2024-01-03 12:00:00', 3, 3),
(4, 700000, 30000, '2024-01-04 13:00:00', 4, 4),
(5, 600000, 0, '2024-01-05 14:00:00', 5, 5),
(6, 500000, 0, '2024-01-06 15:00:00', 6, 6),
(7, 700000, 40000, '2024-01-07 16:00:00', 7, 7),
(8, 600000, 0, '2024-01-08 17:00:00', 8, 8),
(9, 550000, 0, '2024-01-09 18:00:00', 9, 9),
(10, 700000, 50000, '2024-01-10 19:00:00', 10, 10),
(12, 10, 10, '2024-04-19 00:00:00', 1, 1),
(13, 1000, 500, '2024-04-28 00:00:00', 1, 1),
(14, 10, 10, '2024-04-19 00:00:00', 1, 1),
(15, 10, 10, '2024-04-19 00:00:00', 1, 1),
(16, 10, 10, '2024-04-19 00:00:00', 1, 1),
(17, 10, 10, '2024-04-19 00:00:00', 1, 1),
(18, 4000, 0, '0000-00-00 00:00:00', 15, 1),
(19, 4000, 0, '2024-05-17 04:17:04', 15, 1),
(20, 2000, 100, '2024-01-01 10:00:00', 1, 1),
(21, 4000, 0, '2024-05-17 04:32:27', 15, 1),
(22, 14300, 0, '2024-05-17 04:33:02', 15, 11),
(23, 13123, 0, '2024-05-18 11:10:45', 15, 1),
(24, 17000, 0, '2024-05-20 09:29:06', 15, 98789498),
(25, 11000, 0, '2024-05-20 09:30:27', 15, 1),
(26, 4000, 0, '2024-05-20 09:34:29', 15, 1),
(27, 4000, 0, '2024-05-20 09:39:25', 15, 1),
(28, 11000, 0, '2024-05-20 09:39:49', 15, 1),
(29, 4000, 0, '2024-05-20 09:48:01', 15, 1),
(30, 6500, 0, '2024-05-20 09:48:50', 15, 1),
(31, 7500, 0, '2024-05-20 09:49:06', 15, 1),
(32, 13123, 0, '2024-05-20 09:49:21', 15, 1),
(33, 6500, 0, '2024-05-20 10:06:00', 15, 1),
(34, 8000, 0, '2024-05-20 10:07:18', 15, 1),
(35, 6500, 0, '2024-05-20 10:14:36', 15, 1),
(36, 6000, 0, '2024-05-20 10:15:27', 15, 1),
(37, 12000, 0, '2024-05-20 10:27:07', 15, 1),
(38, 114500, 0, '2024-05-20 10:37:05', 15, 1),
(39, 22500, 0, '2024-05-20 10:37:50', 15, 1),
(40, 106000, 0, '2024-05-20 10:38:47', 15, 1),
(41, 163133, 0, '2024-05-20 10:42:07', 15, 1),
(42, 36623, 0, '2024-05-20 10:43:30', 15, 1),
(43, 74123, 0, '2024-05-20 10:48:43', 15, 1),
(44, 58123, 0, '2024-05-20 10:50:02', 15, 1),
(45, 36623, 0, '2024-05-20 10:51:29', 15, 1),
(46, 17000, 0, '2024-05-20 10:52:51', 15, 1),
(47, 4000, 0, '2024-05-20 10:54:15', 15, 1),
(48, 74123, 0, '2024-05-20 10:56:29', 15, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khachhang`
--

CREATE TABLE `khachhang` (
  `idKhachHang` int(11) NOT NULL,
  `SDT` varchar(10) NOT NULL,
  `ten` varchar(255) NOT NULL,
  `trangthai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `khachhang`
--

INSERT INTO `khachhang` (`idKhachHang`, `SDT`, `ten`, `trangthai`) VALUES
(1, '0123456789', '0', 0),
(2, '0987654321', '0', 0),
(3, '0123456789', '0', 0),
(4, '0987654321', '0', 0),
(5, '0123456789', '0', 0),
(6, '0987654321', '0', 0),
(7, '0123456789', '0', 0),
(8, '0987654321', '0', 0),
(9, '0123456789', '0', 0),
(10, '0987654321', '0', 0),
(11, '0123456789', '0', 0),
(12, '0123456789', 'John Doe', 1),
(13, '0123456789', 'Jane Smith', 1),
(14, '0123456789', 'John Doe', 1),
(15, '0123456789', 'Jane Smith', 1),
(16, '0123456789', 'Jane Smith', 1),
(17, '0123456789', 'Jane Smith', 1),
(18, '0123456789', 'Jane Smith', 1),
(19, '087895561', 'huy', 1),
(20, '0123456789', 'John Doe', 1),
(21, '0123456789', 'Jane Smith', 1),
(22, '0123456789', 'John Doe', 1),
(23, '0123456789', 'Jane Smith', 1),
(24, '0123456789', 'Nguyen Van A', 1),
(25, '0123456789', 'Nguyen Van A', 1),
(26, '098789498', 'nguyen quoc huy', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loaisp`
--

CREATE TABLE `loaisp` (
  `idLoaiSP` int(11) NOT NULL,
  `tenLoaiSP` varchar(50) DEFAULT NULL,
  `dacTinh` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `loaisp`
--

INSERT INTO `loaisp` (`idLoaiSP`, `tenLoaiSP`, `dacTinh`) VALUES
(1, 'Mềm', 'Ngọt'),
(2, 'Cứng', 'Vừa'),
(3, 'Mềm', 'Vừa'),
(4, 'Cứng', 'Ngọt')
;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhacungcap`
--

CREATE TABLE `nhacungcap` (
  `idNhaCungCap` int(11) NOT NULL,
  `tenNCC` varchar(50) DEFAULT NULL,
  `diaChi` varchar(100) DEFAULT NULL,
  `sdt` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhacungcap`
--

INSERT INTO `nhacungcap` (`idNhaCungCap`, `tenNCC`, `diaChi`, `sdt`) VALUES
(1, 'Nhà cung cấp 1', 'Địa chỉ 1', '0123456789'),
(2, 'Nhà cung cấp 2', 'Địa chỉ 2', '0987654321'),
(3, 'Nhà cung cấp 3', 'Địa chỉ 3', '0123456789'),
(4, 'Nhà cung cấp 4', 'Địa chỉ 4', '0987654321'),
(5, 'Nhà cung cấp 5', 'Địa chỉ 5', '0123456789'),
(6, 'Nhà cung cấp 6', 'Địa chỉ 6', '0987654321'),
(7, 'Nhà cung cấp 7', 'Địa chỉ 7', '0123456789'),
(8, 'Nhà cung cấp 8', 'Địa chỉ 8', '0987654321'),
(9, 'Nhà cung cấp 9', 'Địa chỉ 9', '0123456789'),
(10, 'Nhà cung cấp 10', 'Địa chỉ 10', '0987654321');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `idNhanVien` int(11) NOT NULL,
  `MK` varchar(50) DEFAULT NULL,
  `CCCD` varchar(12) DEFAULT NULL,
  `hoTenLot` varchar(50) DEFAULT NULL,
  `ten` varchar(50) DEFAULT NULL,
  `ngaySinh` varchar(255) DEFAULT NULL,
  `SDT` varchar(10) DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL,
  `chucVu` int(11) DEFAULT NULL,
  `luongThang` int(11) DEFAULT NULL,
  `gioiTinh` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`idNhanVien`, `MK`, `CCCD`, `hoTenLot`, `ten`, `ngaySinh`, `SDT`, `trangThai`, `chucVu`, `luongThang`, `gioiTinh`) VALUES
(1, '1', '123456789012', 'Trần', 'Thị B', '1990-01-01 00:00:00', '0123456789', 0, 1, 25000, 0),
(2, 'password2', '987654321012', 'Trần', 'Thị B', '1995-02-02 00:00:00', '0987654321', 0, 0, 25000, 0),
(3, 'password3', '456789012345', 'Lê', 'Thị C', '1992-03-03 00:00:00', '0123456789', 0, 1, 25000, 0),
(4, 'password4', '543210987654', 'Phạm', 'Văn D', '1988-04-04 00:00:00', '0987654321', 0, 1, 25000, 0),
(5, 'password5', '987654321012', 'Trần', 'Văn E', '1993-05-05 00:00:00', '0123456789', 1, 1, 25000, 0),
(6, 'password6', '123456789012', 'Nguyễn', 'Thị F', '1996-06-06 00:00:00', '0987654321', 1, 1, 25000, 0),
(7, 'password7', '210987654321', 'Võ', 'Thị G', '1991-07-07 00:00:00', '0123456789', 1, 3, 25000, 0),
(8, 'password8', '432109876543', 'Trương', 'Văn H', '1989-08-08', '0987654321', 1, 1, 25000, 1),
(17, '4', '333333333333', 'Nguyễn Quốc', 'Huy', '2004-01-04 ', '3333333333', 1, 1, 25000, 1),
(18, '5', '555555555555', 'Lê Ngọc ', 'Anh Huy', '2004-01-04 ', '2222222222', 1, 1, 25000, 1),
(19, '6', '888888888888', 'thái', 'hồng chiến', '2004-01-04 ', '1111111111', 1, 1, 25000, 1),
(20, '7', '666666666666', '2', 'chiênd', '2004-01-04 ', '1111111111', 1, 1, 20000, 0),
(21, '4', '111111111111', 'Nguyễn Quốc', 'Huy', '2004-01-04 ', '3333333333', 1, 1, 25000, 1),
(22, '7', '666666666661', '2', 'chiênd', '2004-01-04 ', '1111111111', 1, 1, 25000, 0),
(23, '4', '000000000000', 'Nguyễn Quốc', 'Huy', '2004-01-04 ', '3333333333', 1, 1, 20000, 1),
(24, '7', '888888878888', '2', 'chiênd', '2004-01-04 ', '1111111111', 1, 1, 25000, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieunhap`
--

CREATE TABLE `phieunhap` (
  `idPhieuNhap` int(11) NOT NULL,
  `ngayLap` datetime DEFAULT NULL,
  `trangThai` int(11) DEFAULT NULL,
  `tongTien` int(11) DEFAULT NULL,
  `idNhaCungCap` int(11) DEFAULT NULL,
  `idNhanVien` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhap`
--

INSERT INTO `phieunhap` (`idPhieuNhap`, `ngayLap`, `trangThai`, `tongTien`, `idNhaCungCap`, `idNhanVien`) VALUES
(1, '2024-01-01 10:00:00', 1, 5000000, 1, 1),
(2, '2024-01-02 11:00:00', 1, 6000000, 2, 2),
(3, '2024-01-03 12:00:00', 1, 5500000, 3, 3),
(4, '2024-01-04 13:00:00', 1, 7000000, 4, 4),
(5, '2024-01-05 14:00:00', 1, 6000000, 5, 5),
(6, '2024-01-06 15:00:00', 1, 5000000, 6, 6),
(7, '2024-01-07 16:00:00', 1, 7000000, 7, 7),
(8, '2024-01-08 17:00:00', 1, 6000000, 8, 8),
(9, '2024-01-09 18:00:00', 1, 5500000, 9, 9),
(10, '2024-01-10 19:00:00', 1, 7000000, 10, 10);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `idSP` int(11) NOT NULL,
  `tenSP` varchar(50) DEFAULT NULL,
  `soLuongSpConLai` int(11) DEFAULT NULL,
  `HSD` datetime DEFAULT NULL,
  `NSX` datetime DEFAULT NULL,
  `hinhAnhMinhHoa` varchar(50) DEFAULT NULL,
  `donGia` int(11) DEFAULT NULL,
  `idLoaiSP` int(11) DEFAULT NULL,
  `idChiTietSP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`idSP`, `tenSP`, `soLuongSpConLai`, `HSD`, `NSX`, `hinhAnhMinhHoa`, `donGia`, `idLoaiSP`, `idChiTietSP`) VALUES
(1, 'Choco Pie 1', 64, '2024-04-01 00:00:00', '2023-12-01 00:00:00', 'hinh1.jpg', 5000, 1, 1),
(2, 'Choco Pie 2', 182, '2024-05-10 00:00:00', '2023-11-15 00:00:00', 'hinh2.jpg', 7000, 2, 2),
(3, 'Choco Pie 3', 12, '2024-03-28 00:00:00', '2023-10-20 00:00:00', 'hinh3.jpg', 6000, 3, 3),
(4, 'Choco Pie 4', 9, '2024-06-05 00:00:00', '2023-09-05 00:00:00', 'hinh4.jpg', 13123, 3, 4),
(5, 'Choco Pie 5', 10, '2024-07-15 00:00:00', '2023-08-10 00:00:00', 'hinh5.jpg', 6500, 2, 3),
(6, 'Choco Pie 6', 99, '2024-04-30 00:00:00', '2023-07-01 00:00:00', 'hinh6.jpg', 7500, 4, 4),
(7, 'Choco Pie 7', 54, '2024-09-20 00:00:00', '2023-06-15 00:00:00', 'hinh7.jpg', 6000, 1, 3),
(8, 'Choco Pie 8', 92, '2024-08-10 00:00:00', '2023-05-20 00:00:00', 'hinh8.jpg', 8000, 1, 2),
(9, 'Choco Pie 9', 76, '2024-06-15 00:00:00', '2023-04-01 00:00:00', 'hinh9.jpg', 7000, 1, 1),
(10, 'Choco Pie 10', 64, '2024-05-01 00:00:00', '2023-03-15 00:00:00', 'hinh10.jpg', 9000, 1, 2);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietchuongtrinhgiamgia`
--
ALTER TABLE `chitietchuongtrinhgiamgia`
  ADD PRIMARY KEY (`idChiTietChuongTrinhGiamGia`),
  ADD KEY `idChuongTrinh` (`idChuongTrinh`);

--
-- Chỉ mục cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD PRIMARY KEY (`idChiTietHoaDon`),
  ADD KEY `chitiethoadon_ibfk_1` (`idHoaDon`);

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD PRIMARY KEY (`idChiTietPhieuNhap`),
  ADD KEY `idPhieuNhap` (`idPhieuNhap`),
  ADD KEY `idSP` (`idSP`);

--
-- Chỉ mục cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  ADD PRIMARY KEY (`idChiTietSP`);

--
-- Chỉ mục cho bảng `chuongtrinhgiamgia`
--
ALTER TABLE `chuongtrinhgiamgia`
  ADD PRIMARY KEY (`idChuongTrinh`);

--
-- Chỉ mục cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`idHoaDon`),
  ADD KEY `idNhanVien` (`idNhanVien`),
  ADD KEY `idKhachHang` (`idKhachHang`);

--
-- Chỉ mục cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  ADD PRIMARY KEY (`idKhachHang`,`SDT`);

--
-- Chỉ mục cho bảng `loaisp`
--
ALTER TABLE `loaisp`
  ADD PRIMARY KEY (`idLoaiSP`);

--
-- Chỉ mục cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  ADD PRIMARY KEY (`idNhaCungCap`);

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`idNhanVien`);

--
-- Chỉ mục cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD PRIMARY KEY (`idPhieuNhap`),
  ADD KEY `idNhanVien` (`idNhanVien`),
  ADD KEY `idNhaCungCap` (`idNhaCungCap`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`idSP`),
  ADD KEY `idLoaiSP` (`idLoaiSP`),
  ADD KEY `idChiTietSP` (`idChiTietSP`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `chitietchuongtrinhgiamgia`
--
ALTER TABLE `chitietchuongtrinhgiamgia`
  MODIFY `idChiTietChuongTrinhGiamGia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  MODIFY `idChiTietHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=115;

--
-- AUTO_INCREMENT cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  MODIFY `idChiTietPhieuNhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `chitietsp`
--
ALTER TABLE `chitietsp`
  MODIFY `idChiTietSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `chuongtrinhgiamgia`
--
ALTER TABLE `chuongtrinhgiamgia`
  MODIFY `idChuongTrinh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT cho bảng `hoadon`
--
ALTER TABLE `hoadon`
  MODIFY `idHoaDon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT cho bảng `khachhang`
--
ALTER TABLE `khachhang`
  MODIFY `idKhachHang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT cho bảng `loaisp`
--
ALTER TABLE `loaisp`
  MODIFY `idLoaiSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `nhacungcap`
--
ALTER TABLE `nhacungcap`
  MODIFY `idNhaCungCap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  MODIFY `idNhanVien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  MODIFY `idPhieuNhap` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `idSP` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietchuongtrinhgiamgia`
--
ALTER TABLE `chitietchuongtrinhgiamgia`
  ADD CONSTRAINT `chitietchuongtrinhgiamgia_ibfk_1` FOREIGN KEY (`idChuongTrinh`) REFERENCES `chuongtrinhgiamgia` (`idChuongTrinh`);

--
-- Các ràng buộc cho bảng `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
  ADD CONSTRAINT `chitiethoadon_ibfk_1` FOREIGN KEY (`idHoaDon`) REFERENCES `hoadon` (`idHoaDon`);

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `chitietphieunhap_ibfk_1` FOREIGN KEY (`idPhieuNhap`) REFERENCES `phieunhap` (`idPhieuNhap`),
  ADD CONSTRAINT `chitietphieunhap_ibfk_2` FOREIGN KEY (`idSP`) REFERENCES `sanpham` (`idSP`);

--
-- Các ràng buộc cho bảng `phieunhap`
--
ALTER TABLE `phieunhap`
  ADD CONSTRAINT `phieunhap_ibfk_1` FOREIGN KEY (`idNhanVien`) REFERENCES `nhanvien` (`idNhanVien`),
  ADD CONSTRAINT `phieunhap_ibfk_2` FOREIGN KEY (`idNhaCungCap`) REFERENCES `nhacungcap` (`idNhaCungCap`);

--
-- Các ràng buộc cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD CONSTRAINT `sanpham_ibfk_1` FOREIGN KEY (`idLoaiSP`) REFERENCES `loaisp` (`idLoaiSP`),
  ADD CONSTRAINT `sanpham_ibfk_2` FOREIGN KEY (`idChiTietSP`) REFERENCES `chitietsp` (`idChiTietSP`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
