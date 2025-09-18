
#include <iostream>
#include <vector>
#include <string>

int main() {
    std::vector<int> a = {1, 2, 3, 4, 5, 6, 7};
    std::vector<std::vector<int>> m;
    m.push_back(a);
    m.push_back({"l"});
    for (const auto& v : m) {
        for (const auto& e : v) {
            std::cout << e << " ";
        }
        std::cout << std::endl;
    }
    return 0;
}
