# OOAD-2026-14

**Bài tập nhóm 14**
**Học phần:** Phân tích và thiết kế hướng đối tượng

# PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁN ĐIỆN THOẠI

### Thành viên

* Nguyễn Nhật Dũng
* Phan Thành Công

## 1. Phát biểu bài toán

Việc quản lý cửa hàng điện thoại bằng phương pháp thủ công gây khó khăn trong việc quản lý sản phẩm, nhân viên, khách hàng, nhập hàng và bán hàng. Khi số lượng sản phẩm và giao dịch tăng, việc tìm kiếm, cập nhật tồn kho, lập hóa đơn và thống kê doanh thu dễ xảy ra sai sót.

Vì vậy, nhóm xây dựng **Phần mềm quản lý cửa hàng bán điện thoại** nhằm tin học hóa các hoạt động quản lý và kinh doanh của cửa hàng.

Phần mềm hỗ trợ quản lý sản phẩm, nhân viên, khách hàng, nhập hàng, bán hàng và báo cáo thống kê. Hệ thống tự động cập nhật tồn kho khi nhập hoặc bán sản phẩm, đồng thời hỗ trợ lập hóa đơn và theo dõi doanh thu.

## 2. Yêu cầu hệ thống

### 2.1. Quản lý sản phẩm

* Thêm, sửa, xóa sản phẩm.
* Xem và tìm kiếm sản phẩm.
* Cập nhật số lượng tồn kho.

**Thông tin sản phẩm:**

* Mã điện thoại
* Tên điện thoại
* Hãng sản xuất
* Giá bán
* Số lượng
* Màu sắc
* RAM
* Bộ nhớ
* Mô tả

### 2.2. Quản lý khách hàng

* Thêm, sửa, xóa khách hàng.
* Tìm kiếm và xem thông tin khách hàng.

**Thông tin khách hàng:**

* Mã khách hàng
* Họ tên
* Số điện thoại
* Địa chỉ
* Email

### 2.3. Quản lý nhân viên

**Quản lý** có thể:

* Thêm, sửa, xóa nhân viên.
* Xem và tìm kiếm nhân viên.

### 2.4. Quản lý bán hàng

**Nhân viên/Quản lý** có thể:

* Tạo hóa đơn.
* Chọn khách hàng và sản phẩm.
* Nhập số lượng.
* Tính tổng tiền.
* Xác nhận thanh toán.
* Xuất hóa đơn.

Khi bán hàng, hệ thống tự động giảm số lượng sản phẩm trong kho.

### 2.5. Quản lý nhập hàng

**Nhân viên/Quản lý** có thể:

* Tạo phiếu nhập.
* Chọn sản phẩm.
* Nhập số lượng và giá nhập.
* Cập nhật tồn kho.

### 2.6. Quản lý tài khoản

* Đăng nhập.
* Đăng xuất.
* Thay đổi mật khẩu.

### 2.7. Báo cáo và thống kê

**Quản lý** có thể:

* Xem doanh thu.
* Xem số lượng sản phẩm đã bán.
* Xem sản phẩm tồn kho.
* Xem lịch sử bán hàng.
* Thống kê doanh thu theo ngày/tháng.

## 3. Xác định Actor

Hệ thống gồm **2 Actor chính**:

### 👤 Quản lý

* Quản lý sản phẩm.
* Quản lý nhân viên.
* Quản lý khách hàng.
* Quản lý nhập hàng.
* Quản lý bán hàng.
* Xem báo cáo và thống kê.

### 👤 Nhân viên

* Đăng nhập/đăng xuất.
* Quản lý khách hàng.
* Xem và tìm kiếm sản phẩm.
* Bán hàng.
* Tạo hóa đơn.
* Nhập hàng theo quyền được phân công.

## 4. Các Use Case chính

### Quản lý sản phẩm

* Thêm sản phẩm
* Sửa sản phẩm
* Xóa sản phẩm
* Tìm kiếm sản phẩm
* Xem sản phẩm
* Cập nhật tồn kho

### Quản lý khách hàng

* Thêm khách hàng
* Sửa khách hàng
* Xóa khách hàng
* Tìm kiếm khách hàng
* Xem khách hàng

### Quản lý nhân viên

* Thêm nhân viên
* Sửa nhân viên
* Xóa nhân viên
* Tìm kiếm nhân viên
* Xem nhân viên

### Bán hàng

* Tạo hóa đơn
* Chọn sản phẩm
* Chọn khách hàng
* Tính tổng tiền
* Thanh toán
* Xuất hóa đơn

### Nhập hàng

* Tạo phiếu nhập
* Chọn sản phẩm
* Nhập số lượng
* Cập nhật tồn kho

### Báo cáo và thống kê

* Thống kê doanh thu
* Thống kê sản phẩm đã bán
* Thống kê tồn kho
* Xem lịch sử bán hàng
## 5. Sơ đồ Use Case

## 5. Sơ đồ Use Case

![Sơ đồ Use Case](sơ%20đồ%20usecase.png)
