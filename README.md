# OOAD-2026-14
# PHẦN MỀM QUẢN LÝ CỬA HÀNG BÁN ĐIỆN THOẠI
1. Yêu cầu hệ thống
1.1. Quản lý sản phẩm

Hệ thống cho phép nhân viên quản lý các sản phẩm điện thoại trong cửa hàng:

Thêm điện thoại mới.
Sửa thông tin điện thoại.
Xóa điện thoại.
Xem danh sách điện thoại.
Tìm kiếm điện thoại.
Cập nhật số lượng tồn kho.

Thông tin điện thoại gồm:

Mã điện thoại
Tên điện thoại
Hãng sản xuất
Giá bán
Số lượng
Màu sắc
RAM
Bộ nhớ
Thông tin mô tả
1.2. Quản lý khách hàng

Hệ thống cho phép nhân viên:

Thêm khách hàng.
Sửa thông tin khách hàng.
Xóa khách hàng.
Tìm kiếm khách hàng.
Xem thông tin khách hàng.

Thông tin khách hàng gồm:

Mã khách hàng
Họ tên
Số điện thoại
Địa chỉ
Email
1.3. Quản lý nhân viên

Quản lý có thể:

Thêm nhân viên.
Sửa thông tin nhân viên.
Xóa nhân viên.
Xem danh sách nhân viên.
Tìm kiếm nhân viên.
1.4. Quản lý bán hàng

Nhân viên có thể:

Tạo hóa đơn bán hàng.
Chọn khách hàng.
Chọn điện thoại cần bán.
Nhập số lượng.
Tính tổng tiền.
Xác nhận thanh toán.
In/xuất hóa đơn.

Khi bán điện thoại, hệ thống tự động giảm số lượng sản phẩm trong kho.

1.5. Quản lý nhập hàng

Nhân viên/quản lý có thể:

Tạo phiếu nhập hàng.
Chọn sản phẩm.
Nhập số lượng nhập.
Nhập giá nhập.
Cập nhật số lượng tồn kho.
1.6. Quản lý tài khoản

Hệ thống cho phép người dùng:

Đăng nhập.
Đăng xuất.
Thay đổi mật khẩu.
1.7. Báo cáo và thống kê

Quản lý có thể:

Xem doanh thu.
Xem số lượng điện thoại đã bán.
Xem sản phẩm tồn kho.
Xem lịch sử bán hàng.
Thống kê doanh thu theo ngày/tháng.
2. XÁC ĐỊNH ACTOR

Đây là phần rất quan trọng để vẽ Use Case.

Với cửa hàng điện thoại, mình đề xuất 3 actor chính:

👤 Quản lý

Có quyền:

Quản lý sản phẩm
Quản lý nhân viên
Quản lý khách hàng
Nhập hàng
Xem báo cáo
Quản lý bán hàng
👤 Nhân viên

Có quyền:

Đăng nhập
Quản lý khách hàng
Tìm kiếm sản phẩm
Bán hàng
Tạo hóa đơn
Nhập hàng nếu được phân quyền
👤 Khách hàng

Có thể:

Xem/tìm kiếm sản phẩm
Cung cấp thông tin cá nhân
Mua điện thoại

Đăng nhập
Đăng xuất

Quản lý sản phẩm
 ├── Thêm sản phẩm
 ├── Sửa sản phẩm
 ├── Xóa sản phẩm
 ├── Tìm kiếm sản phẩm
 └── Xem sản phẩm

Quản lý khách hàng
 ├── Thêm khách hàng
 ├── Sửa khách hàng
 ├── Xóa khách hàng
 └── Tìm kiếm khách hàng

Quản lý nhân viên
 ├── Thêm nhân viên
 ├── Sửa nhân viên
 ├── Xóa nhân viên
 └── Tìm kiếm nhân viên

Bán hàng
 ├── Tạo hóa đơn
 ├── Chọn sản phẩm
 ├── Tính tổng tiền
 └── Thanh toán

Nhập hàng
 ├── Tạo phiếu nhập
 ├── Chọn sản phẩm
 └── Cập nhật tồn kho

Báo cáo thống kê
 ├── Thống kê doanh thu
 └── Thống kê tồn kho
