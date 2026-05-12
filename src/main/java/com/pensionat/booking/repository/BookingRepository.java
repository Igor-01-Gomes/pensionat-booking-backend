package com.pensionat.booking.repository;

import java.time.LocalDate;

public interface BookingRepository {

    extends JpaRepository<BookingEntity, Integer> {

        boolean existsByCustomerIdStatus(int customerId, BookingStatus status);

        List<BookingEntity> findByCustomerId(int customerId);

        List<BookingEntity>findByRoomIdAndDateStatus(
        int roomId,
        BookingStatus status,
        LocalDate endDate,
        LocalDate startDate
        );
    }

}
