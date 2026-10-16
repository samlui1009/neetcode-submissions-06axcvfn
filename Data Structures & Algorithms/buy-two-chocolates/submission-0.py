class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        sorted_prices = sorted(prices)
        expected_price = sorted_prices[0] + sorted_prices[1]
        if expected_price > money:
            return money
        return money - expected_price
        