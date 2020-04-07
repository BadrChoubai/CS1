class MilitaryTimeConverter():
    def __init__(self, military_time: str):
        self.military_time = military_time
        self.civilian_time = self.convert()

    def convert(self):
        hours = self.military_time[0:2]
        minutes = self.military_time[2:4]

        if int(hours) > 12:
            hours = int(hours) - 12

        return f'{hours}:{minutes}'


time_converter = MilitaryTimeConverter("1400")
print(time_converter.military_time)
print(time_converter.civilian_time)
