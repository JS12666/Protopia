package study.protopia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<String, String> {

    // 주식 구매

    // 주식 판매

    // 내주식 조회

    // 실시간 주가 조회
}
