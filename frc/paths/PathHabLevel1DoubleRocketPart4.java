/**
 * Copyright (c) 2019 Team 3555
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package frc.paths;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;


public class PathHabLevel1DoubleRocketPart4 extends SrxTrajectory {
	
	public PathHabLevel1DoubleRocketPart4() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
	
	public PathHabLevel1DoubleRocketPart4(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
    
	public boolean highGear = true;

	double[][] centerPoints = {
		{0, 0, 10.000, 0},
		{-0.072, -1.435, 10.000, 0.005},
		{-0.359, -4.306, 10.000, 0.005},
		{-1.005, -8.613, 10.000, 0.005},
		{-2.153, -14.354, 10.000, 0.005},
		{-3.947, -21.531, 10.000, 0.005},
		{-6.531, -30.144, 10.000, 0.005},
		{-10.048, -40.192, 10.000, 0.005},
		{-14.641, -51.676, 10.000, 0.005},
		{-20.455, -64.594, 10.000, 0.005},
		{-27.632, -78.949, 10.000, 0.005},
		{-36.316, -94.738, 10.000, 0.005},
		{-46.652, -111.964, 10.000, 0.006},
		{-58.781, -130.624, 10.000, 0.006},
		{-72.848, -150.720, 10.000, 0.006},
		{-88.997, -172.252, 10.000, 0.006},
		{-107.370, -195.219, 10.000, 0.007},
		{-128.112, -219.621, 10.000, 0.007},
		{-151.294, -244.023, 10.000, 0.008},
		{-176.917, -268.426, 10.000, 0.009},
		{-204.980, -292.828, 10.000, 0.011},
		{-235.483, -317.230, 10.000, 0.012},
		{-268.426, -341.633, 10.000, 0.014},
		{-303.809, -366.035, 10.000, 0.017},
		{-341.633, -390.437, 10.000, 0.020},
		{-381.897, -414.840, 10.000, 0.024},
		{-424.601, -439.242, 10.000, 0.028},
		{-469.745, -463.644, 10.000, 0.033},
		{-517.329, -488.047, 10.000, 0.039},
		{-567.354, -512.449, 10.000, 0.046},
		{-619.819, -536.851, 10.000, 0.053},
		{-674.725, -561.254, 10.000, 0.062},
		{-732.070, -585.656, 10.000, 0.072},
		{-791.856, -610.058, 10.000, 0.083},
		{-854.082, -634.461, 10.000, 0.096},
		{-918.748, -658.863, 10.000, 0.109},
		{-985.854, -683.265, 10.000, 0.125},
		{-1055.401, -707.668, 10.000, 0.142},
		{-1127.388, -732.070, 10.000, 0.161},
		{-1201.815, -756.472, 10.000, 0.181},
		{-1278.682, -780.875, 10.000, 0.204},
		{-1357.990, -805.277, 10.000, 0.228},
		{-1439.738, -829.679, 10.000, 0.255},
		{-1523.926, -854.082, 10.000, 0.284},
		{-1610.554, -878.484, 10.000, 0.315},
		{-1699.623, -902.886, 10.000, 0.349},
		{-1791.131, -927.289, 10.000, 0.385},
		{-1885.080, -951.691, 10.000, 0.424},
		{-1981.470, -976.093, 10.000, 0.466},
		{-2080.299, -1000.496, 10.000, 0.511},
		{-2181.569, -1024.898, 10.000, 0.559},
		{-2285.279, -1049.300, 10.000, 0.610},
		{-2391.429, -1073.703, 10.000, 0.664},
		{-2500.019, -1098.105, 10.000, 0.721},
		{-2611.050, -1122.507, 10.000, 0.782},
		{-2724.521, -1146.910, 10.000, 0.847},
		{-2840.432, -1171.312, 10.000, 0.915},
		{-2958.783, -1195.714, 10.000, 0.987},
		{-3079.575, -1220.117, 10.000, 1.063},
		{-3202.806, -1244.519, 10.000, 1.142},
		{-3328.478, -1268.921, 10.000, 1.226},
		{-3456.591, -1293.324, 10.000, 1.314},
		{-3587.143, -1317.726, 10.000, 1.406},
		{-3720.136, -1342.128, 10.000, 1.502},
		{-3855.569, -1366.531, 10.000, 1.602},
		{-3993.442, -1390.933, 10.000, 1.707},
		{-4133.755, -1415.335, 10.000, 1.817},
		{-4276.509, -1439.738, 10.000, 1.931},
		{-4421.703, -1464.140, 10.000, 2.049},
		{-4569.337, -1488.542, 10.000, 2.172},
		{-4719.411, -1512.945, 10.000, 2.300},
		{-4871.926, -1537.347, 10.000, 2.433},
		{-5026.881, -1561.749, 10.000, 2.570},
		{-5184.276, -1586.152, 10.000, 2.712},
		{-5344.111, -1610.554, 10.000, 2.859},
		{-5506.387, -1634.956, 10.000, 3.010},
		{-5671.103, -1659.359, 10.000, 3.167},
		{-5838.259, -1683.761, 10.000, 3.328},
		{-6007.855, -1708.163, 10.000, 3.494},
		{-6179.891, -1732.566, 10.000, 3.664},
		{-6354.368, -1756.968, 10.000, 3.840},
		{-6531.285, -1781.370, 10.000, 4.019},
		{-6710.642, -1805.773, 10.000, 4.204},
		{-6892.439, -1830.175, 10.000, 4.393},
		{-7076.677, -1854.577, 10.000, 4.586},
		{-7263.355, -1878.980, 10.000, 4.784},
		{-7452.473, -1903.382, 10.000, 4.986},
		{-7644.031, -1927.784, 10.000, 5.192},
		{-7838.030, -1952.187, 10.000, 5.403},
		{-8034.469, -1976.589, 10.000, 5.617},
		{-8233.348, -2000.991, 10.000, 5.835},
		{-8434.667, -2025.394, 10.000, 6.056},
		{-8638.426, -2049.796, 10.000, 6.281},
		{-8844.626, -2074.198, 10.000, 6.509},
		{-9053.266, -2098.601, 10.000, 6.741},
		{-9264.346, -2123.003, 10.000, 6.975},
		{-9477.867, -2147.405, 10.000, 7.212},
		{-9693.827, -2171.808, 10.000, 7.451},
		{-9912.228, -2196.210, 10.000, 7.693},
		{-10133.069, -2220.612, 10.000, 7.936},
		{-10356.351, -2245.015, 10.000, 8.181},
		{-10582.072, -2269.417, 10.000, 8.428},
		{-10810.234, -2293.819, 10.000, 8.676},
		{-11040.836, -2318.222, 10.000, 8.924},
		{-11273.879, -2342.624, 10.000, 9.174},
		{-11509.361, -2367.026, 10.000, 9.423},
		{-11747.212, -2389.993, 10.000, 9.673},
		{-11987.288, -2411.525, 10.000, 9.921},
		{-12229.445, -2431.621, 10.000, 10.169},
		{-12473.540, -2450.281, 10.000, 10.415},
		{-12719.430, -2467.507, 10.000, 10.659},
		{-12966.970, -2483.296, 10.000, 10.901},
		{-13216.017, -2497.651, 10.000, 11.140},
		{-13466.428, -2510.570, 10.000, 11.375},
		{-13718.059, -2522.053, 10.000, 11.607},
		{-13970.767, -2532.101, 10.000, 11.834},
		{-14224.408, -2540.714, 10.000, 12.057},
		{-14478.838, -2547.891, 10.000, 12.274},
		{-14733.914, -2553.633, 10.000, 12.487},
		{-14989.493, -2557.939, 10.000, 12.693},
		{-15245.430, -2560.810, 10.000, 12.894},
		{-15501.583, -2562.245, 10.000, 13.088},
		{-15757.807, -2562.245, 10.000, 13.276},
		{-16014.032, -2562.245, 10.000, 13.457},
		{-16270.256, -2562.245, 10.000, 13.630},
		{-16526.481, -2562.245, 10.000, 13.797},
		{-16782.706, -2562.245, 10.000, 13.957},
		{-17038.930, -2562.245, 10.000, 14.109},
		{-17295.155, -2562.245, 10.000, 14.253},
		{-17551.379, -2562.245, 10.000, 14.391},
		{-17807.604, -2562.245, 10.000, 14.520},
		{-18063.828, -2562.245, 10.000, 14.642},
		{-18320.053, -2562.245, 10.000, 14.756},
		{-18576.277, -2562.245, 10.000, 14.862},
		{-18832.502, -2562.245, 10.000, 14.960},
		{-19088.726, -2562.245, 10.000, 15.050},
		{-19344.951, -2562.245, 10.000, 15.132},
		{-19601.175, -2562.245, 10.000, 15.206},
		{-19857.400, -2562.245, 10.000, 15.272},
		{-20113.624, -2562.245, 10.000, 15.330},
		{-20369.849, -2562.245, 10.000, 15.380},
		{-20626.073, -2562.245, 10.000, 15.422},
		{-20882.298, -2562.245, 10.000, 15.455},
		{-21138.522, -2562.245, 10.000, 15.481},
		{-21394.747, -2562.245, 10.000, 15.498},
		{-21650.971, -2562.245, 10.000, 15.507},
		{-21907.196, -2562.245, 10.000, 15.508},
		{-22163.420, -2562.245, 10.000, 15.501},
		{-22419.645, -2562.245, 10.000, 15.486},
		{-22675.869, -2562.245, 10.000, 15.463},
		{-22932.094, -2562.245, 10.000, 15.432},
		{-23188.318, -2562.245, 10.000, 15.393},
		{-23444.543, -2562.245, 10.000, 15.347},
		{-23700.767, -2562.245, 10.000, 15.292},
		{-23956.992, -2562.245, 10.000, 15.230},
		{-24213.216, -2562.245, 10.000, 15.161},
		{-24469.441, -2562.245, 10.000, 15.084},
		{-24725.665, -2562.245, 10.000, 14.999},
		{-24981.890, -2562.245, 10.000, 14.907},
		{-25238.114, -2562.245, 10.000, 14.808},
		{-25494.339, -2562.245, 10.000, 14.702},
		{-25750.563, -2562.245, 10.000, 14.589},
		{-26006.788, -2562.245, 10.000, 14.469},
		{-26263.012, -2562.245, 10.000, 14.343},
		{-26519.237, -2562.245, 10.000, 14.210},
		{-26775.461, -2562.245, 10.000, 14.070},
		{-27031.686, -2562.245, 10.000, 13.925},
		{-27287.910, -2562.245, 10.000, 13.773},
		{-27544.135, -2562.245, 10.000, 13.616},
		{-27800.360, -2562.245, 10.000, 13.453},
		{-28056.584, -2562.245, 10.000, 13.285},
		{-28312.809, -2562.245, 10.000, 13.111},
		{-28569.033, -2562.245, 10.000, 12.933},
		{-28825.258, -2562.245, 10.000, 12.749},
		{-29081.482, -2562.245, 10.000, 12.561},
		{-29337.707, -2562.245, 10.000, 12.369},
		{-29593.931, -2562.245, 10.000, 12.173},
		{-29850.156, -2562.245, 10.000, 11.973},
		{-30106.380, -2562.245, 10.000, 11.770},
		{-30362.605, -2562.245, 10.000, 11.563},
		{-30618.829, -2562.245, 10.000, 11.354},
		{-30875.054, -2562.245, 10.000, 11.142},
		{-31131.278, -2562.245, 10.000, 10.928},
		{-31387.503, -2562.245, 10.000, 10.711},
		{-31643.727, -2562.245, 10.000, 10.493},
		{-31899.952, -2562.245, 10.000, 10.274},
		{-32156.176, -2562.245, 10.000, 10.054},
		{-32412.401, -2562.245, 10.000, 9.834},
		{-32668.625, -2562.245, 10.000, 9.613},
		{-32924.850, -2562.245, 10.000, 9.392},
		{-33181.074, -2562.245, 10.000, 9.172},
		{-33437.299, -2562.245, 10.000, 8.953},
		{-33693.523, -2562.245, 10.000, 8.735},
		{-33949.748, -2562.245, 10.000, 8.519},
		{-34205.972, -2562.245, 10.000, 8.305},
		{-34462.197, -2562.245, 10.000, 8.094},
		{-34718.421, -2562.245, 10.000, 7.886},
		{-34974.646, -2562.245, 10.000, 7.681},
		{-35230.870, -2562.245, 10.000, 7.480},
		{-35487.095, -2562.245, 10.000, 7.283},
		{-35743.319, -2562.245, 10.000, 7.092},
		{-35999.544, -2562.245, 10.000, 6.905},
		{-36255.768, -2562.245, 10.000, 6.724},
		{-36511.993, -2562.245, 10.000, 6.550},
		{-36768.217, -2562.245, 10.000, 6.382},
		{-37024.442, -2562.245, 10.000, 6.221},
		{-37280.666, -2562.245, 10.000, 6.067},
		{-37536.891, -2562.245, 10.000, 5.922},
		{-37793.115, -2562.245, 10.000, 5.786},
		{-38049.340, -2562.245, 10.000, 5.659},
		{-38305.564, -2562.245, 10.000, 5.541},
		{-38561.789, -2562.245, 10.000, 5.433},
		{-38818.014, -2562.245, 10.000, 5.337},
		{-39074.238, -2562.245, 10.000, 5.251},
		{-39330.463, -2562.245, 10.000, 5.177},
		{-39586.687, -2562.245, 10.000, 5.116},
		{-39842.912, -2562.245, 10.000, 5.067},
		{-40099.136, -2562.245, 10.000, 5.033},
		{-40355.361, -2562.245, 10.000, 5.012},
		{-40611.585, -2562.245, 10.000, 5.005},
		{-40867.810, -2562.245, 10.000, 4.971},
		{-41124.034, -2562.245, 10.000, 4.881},
		{-41380.259, -2562.245, 10.000, 4.736},
		{-41636.483, -2562.245, 10.000, 4.541},
		{-41892.708, -2562.245, 10.000, 4.296},
		{-42148.932, -2562.245, 10.000, 4.004},
		{-42405.157, -2562.245, 10.000, 3.666},
		{-42661.381, -2562.245, 10.000, 3.285},
		{-42917.606, -2562.245, 10.000, 2.862},
		{-43173.830, -2562.245, 10.000, 2.398},
		{-43430.029, -2561.733, 10.000, 1.897},
		{-43686.105, -2559.785, 10.000, 1.359},
		{-43941.914, -2556.401, 10.000, 0.787},
		{-44197.313, -2551.583, 10.000, 0.184},
		{-44452.159, -2545.328, 10.000, -0.450},
		{-44706.307, -2537.639, 10.000, -1.111},
		{-44959.615, -2528.514, 10.000, -1.796},
		{-45211.938, -2517.953, 10.000, -2.504},
		{-45463.134, -2505.957, 10.000, -3.231},
		{-45713.058, -2492.526, 10.000, -3.975},
		{-45961.567, -2477.659, 10.000, -4.732},
		{-46208.518, -2461.357, 10.000, -5.501},
		{-46453.767, -2443.619, 10.000, -6.277},
		{-46697.170, -2424.446, 10.000, -7.059},
		{-46938.584, -2403.837, 10.000, -7.843},
		{-47177.866, -2381.794, 10.000, -8.627},
		{-47414.871, -2358.314, 10.000, -9.408},
		{-47649.482, -2333.912, 10.000, -10.184},
		{-47881.654, -2309.509, 10.000, -10.952},
		{-48111.384, -2285.107, 10.000, -11.711},
		{-48338.675, -2260.705, 10.000, -12.459},
		{-48563.525, -2236.302, 10.000, -13.195},
		{-48785.935, -2211.900, 10.000, -13.917},
		{-49005.905, -2187.498, 10.000, -14.624},
		{-49223.435, -2163.095, 10.000, -15.315},
		{-49438.524, -2138.693, 10.000, -15.989},
		{-49651.174, -2114.291, 10.000, -16.645},
		{-49861.383, -2089.888, 10.000, -17.283},
		{-50069.151, -2065.486, 10.000, -17.902},
		{-50274.480, -2041.084, 10.000, -18.502},
		{-50477.368, -2016.681, 10.000, -19.082},
		{-50677.816, -1992.279, 10.000, -19.643},
		{-50875.824, -1967.877, 10.000, -20.184},
		{-51071.391, -1943.474, 10.000, -20.706},
		{-51264.519, -1919.072, 10.000, -21.207},
		{-51455.206, -1894.670, 10.000, -21.689},
		{-51643.453, -1870.267, 10.000, -22.152},
		{-51829.259, -1845.865, 10.000, -22.596},
		{-52012.626, -1821.463, 10.000, -23.020},
		{-52193.552, -1797.060, 10.000, -23.427},
		{-52372.038, -1772.658, 10.000, -23.815},
		{-52548.084, -1748.256, 10.000, -24.186},
		{-52721.689, -1723.853, 10.000, -24.540},
		{-52892.854, -1699.451, 10.000, -24.877},
		{-53061.579, -1675.049, 10.000, -25.198},
		{-53227.864, -1650.646, 10.000, -25.503},
		{-53391.708, -1626.244, 10.000, -25.792},
		{-53553.113, -1601.842, 10.000, -26.067},
		{-53712.077, -1577.439, 10.000, -26.328},
		{-53868.601, -1553.037, 10.000, -26.575},
		{-54022.684, -1528.635, 10.000, -26.809},
		{-54174.328, -1504.232, 10.000, -27.029},
		{-54323.531, -1479.830, 10.000, -27.238},
		{-54470.294, -1455.428, 10.000, -27.435},
		{-54614.616, -1431.025, 10.000, -27.620},
		{-54756.499, -1406.623, 10.000, -27.795},
		{-54895.941, -1382.221, 10.000, -27.960},
		{-55032.943, -1357.818, 10.000, -28.114},
		{-55167.505, -1333.416, 10.000, -28.259},
		{-55299.626, -1309.014, 10.000, -28.395},
		{-55429.307, -1284.611, 10.000, -28.522},
		{-55556.548, -1260.209, 10.000, -28.641},
		{-55681.349, -1235.807, 10.000, -28.753},
		{-55803.710, -1211.404, 10.000, -28.856},
		{-55923.630, -1187.002, 10.000, -28.953},
		{-56041.110, -1162.600, 10.000, -29.043},
		{-56156.150, -1138.197, 10.000, -29.127},
		{-56268.750, -1113.795, 10.000, -29.205},
		{-56378.909, -1089.393, 10.000, -29.277},
		{-56486.628, -1064.990, 10.000, -29.344},
		{-56591.907, -1040.588, 10.000, -29.406},
		{-56694.746, -1016.186, 10.000, -29.463},
		{-56795.144, -991.783, 10.000, -29.515},
		{-56893.102, -967.381, 10.000, -29.564},
		{-56988.620, -942.979, 10.000, -29.608},
		{-57081.698, -918.576, 10.000, -29.649},
		{-57172.336, -894.174, 10.000, -29.686},
		{-57260.533, -869.772, 10.000, -29.720},
		{-57346.290, -845.369, 10.000, -29.751},
		{-57429.607, -820.967, 10.000, -29.779},
		{-57510.483, -796.565, 10.000, -29.804},
		{-57588.920, -772.162, 10.000, -29.827},
		{-57664.916, -747.760, 10.000, -29.848},
		{-57738.472, -723.358, 10.000, -29.867},
		{-57809.587, -698.955, 10.000, -29.883},
		{-57878.263, -674.553, 10.000, -29.898},
		{-57944.498, -650.151, 10.000, -29.912},
		{-58008.293, -625.748, 10.000, -29.924},
		{-58069.648, -601.346, 10.000, -29.934},
		{-58128.562, -576.944, 10.000, -29.943},
		{-58185.036, -552.541, 10.000, -29.951},
		{-58239.070, -528.139, 10.000, -29.958},
		{-58290.664, -503.737, 10.000, -29.965},
		{-58339.818, -479.334, 10.000, -29.970},
		{-58386.531, -454.932, 10.000, -29.974},
		{-58430.804, -430.530, 10.000, -29.978},
		{-58472.637, -406.127, 10.000, -29.981},
		{-58512.030, -381.725, 10.000, -29.984},
		{-58548.982, -357.323, 10.000, -29.986},
		{-58583.494, -332.920, 10.000, -29.988},
		{-58615.566, -308.518, 10.000, -29.990},
		{-58645.198, -284.116, 10.000, -29.991},
		{-58672.389, -259.713, 10.000, -29.992},
		{-58697.141, -235.311, 10.000, -29.993},
		{-58719.452, -210.909, 10.000, -29.993},
		{-58739.348, -187.019, 10.000, -29.994},
		{-58756.927, -164.564, 10.000, -29.994},
		{-58772.333, -143.545, 10.000, -29.994},
		{-58785.708, -123.962, 10.000, -29.994},
		{-58797.197, -105.814, 10.000, -29.995},
		{-58806.942, -89.101, 10.000, -29.995},
		{-58815.089, -73.824, 10.000, -29.995},
		{-58821.779, -59.982, 10.000, -29.995},
		{-58827.157, -47.576, 10.000, -29.995},
		{-58831.366, -36.605, 10.000, -29.995},
		{-58834.550, -27.069, 10.000, -29.995},
		{-58836.851, -18.969, 10.000, -29.995},
		{-58838.415, -12.304, 10.000, -29.995},
		{-58839.384, -7.075, 10.000, -29.995},
		{-58839.902, -3.281, 10.000, -29.995},
		{-58840.112, -0.923, 10.000, -29.995},
		{-58840.158, 0.000, 10.000, -29.995},
		{-58840.158, 0.000, 10.000, -29.995}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":25,"y":30},"theta":-3.1414999999873814,"comment":""},{"position":{"x":201,"y":59},"theta":-3.0542361110988434,"comment":""},{"position":{"x":277,"y":39},"theta":-3.665083333318612,"comment":""}]
	// IS_REVERSED: true
	// FILE_NAME: PathHabLevel1DoubleRocketPart4
}