package org.usfirst.frc.team291.auto.arrays;

import org.usfirst.frc.team291.pathfollower.Trajectory.Segment;
import org.usfirst.frc.team291.pathfollower.Trajectory;

public class IntakeToScalePath {

	public static final Trajectory[] trajectoryArray =  {
		new Trajectory(new Segment[]{
			new Segment(0.000, 0.011, 0.550, 27.522, 5.934, 0.020, 0.340, 0.933),
			new Segment(0.001, 0.022, 0.550, -0.003, 5.934, 0.020, 0.340, 0.932),
			new Segment(0.002, 0.050, 1.376, 41.267, 5.934, 0.020, 0.341, 0.932),
			new Segment(0.003, 0.088, 1.925, 27.471, 5.934, 0.020, 0.343, 0.931),
			new Segment(0.006, 0.137, 2.473, 27.403, 5.934, 0.020, 0.345, 0.931),
			new Segment(0.010, 0.198, 3.019, 27.294, 5.934, 0.020, 0.349, 0.929),
			new Segment(0.015, 0.269, 3.562, 27.131, 5.934, 0.020, 0.354, 0.927),
			new Segment(0.022, 0.351, 4.100, 26.906, 5.934, 0.020, 0.361, 0.925),
			new Segment(0.031, 0.444, 4.632, 26.610, 5.934, 0.020, 0.369, 0.922),
			new Segment(0.042, 0.541, 4.883, 12.574, 5.934, 0.020, 0.379, 0.918),
			new Segment(0.055, 0.639, 4.856, -1.395, 5.934, 0.020, 0.391, 0.914),
			new Segment(0.070, 0.735, 4.823, -1.634, 5.935, 0.020, 0.405, 0.909),
			new Segment(0.086, 0.831, 4.786, -1.869, 5.935, 0.020, 0.420, 0.903),
			new Segment(0.105, 0.926, 4.744, -2.099, 5.935, 0.020, 0.438, 0.897),
			new Segment(0.125, 1.020, 4.697, -2.326, 5.936, 0.020, 0.457, 0.890),
			new Segment(0.147, 1.112, 4.646, -2.552, 5.936, 0.020, 0.478, 0.882),
			new Segment(0.171, 1.204, 4.590, -2.778, 5.937, 0.020, 0.501, 0.874),
			new Segment(0.197, 1.295, 4.530, -3.009, 5.938, 0.020, 0.525, 0.865),
			new Segment(0.225, 1.384, 4.465, -3.247, 5.939, 0.020, 0.551, 0.856),
			new Segment(0.254, 1.472, 4.395, -3.497, 5.940, 0.020, 0.579, 0.846),
			new Segment(0.286, 1.558, 4.320, -3.764, 5.941, 0.020, 0.608, 0.836),
			new Segment(0.318, 1.643, 4.239, -4.054, 5.943, 0.020, 0.639, 0.825),
			new Segment(0.353, 1.726, 4.152, -4.375, 5.945, 0.020, 0.672, 0.813),
			new Segment(0.389, 1.807, 4.057, -4.733, 5.948, 0.020, 0.706, 0.801),
			new Segment(0.427, 1.886, 3.954, -5.140, 5.951, 0.020, 0.741, 0.789),
			new Segment(0.466, 1.963, 3.842, -5.605, 5.954, 0.020, 0.779, 0.776),
			new Segment(0.507, 2.038, 3.719, -6.142, 5.958, 0.020, 0.817, 0.763),
			new Segment(0.549, 2.109, 3.584, -6.765, 5.963, 0.020, 0.857, 0.750),
			new Segment(0.593, 2.178, 3.434, -7.493, 5.968, 0.020, 0.899, 0.736),
			new Segment(0.638, 2.243, 3.267, -8.346, 5.973, 0.020, 0.941, 0.722),
			new Segment(0.684, 2.305, 3.080, -9.351, 5.980, 0.020, 0.985, 0.708),
			new Segment(0.731, 2.362, 2.869, -10.538, 5.987, 0.020, 1.030, 0.694),
			new Segment(0.779, 2.415, 2.630, -11.944, 5.995, 0.020, 1.077, 0.680),
			new Segment(0.828, 2.462, 2.358, -13.614, 6.005, 0.020, 1.124, 0.667),
			new Segment(0.878, 2.503, 2.046, -15.600, 6.015, 0.020, 1.172, 0.653),
			new Segment(0.929, 2.537, 1.687, -17.967, 6.027, 0.020, 1.221, 0.640),
			new Segment(0.980, 2.562, 1.271, -20.791, 6.040, 0.020, 1.271, 0.627),
			new Segment(1.032, 2.578, 0.788, -24.158, 6.055, 0.020, 1.321, 0.615),
			new Segment(1.084, 2.582, 0.224, -28.169, 6.072, 0.020, 1.371, 0.604),
			new Segment(1.135, 2.574, -0.434, -32.928, 6.091, 0.020, 1.422, 0.594),
			new Segment(1.186, 2.550, -1.205, -38.537, 6.112, 0.020, 1.472, 0.584),
			new Segment(1.236, 2.508, -2.106, -45.066, 6.137, 0.020, 1.521, 0.576),
			new Segment(1.285, 2.444, -3.156, -52.512, 6.164, 0.020, 1.570, 0.570),
			new Segment(1.332, 2.357, -4.371, -60.716, 6.196, 0.020, 1.617, 0.565),
			new Segment(1.377, 2.242, -5.755, -69.218, 6.231, 0.020, 1.661, 0.562),
			new Segment(1.419, 2.096, -7.296, -77.033, 6.272, 0.020, 1.703, 0.561),
			new Segment(1.457, 1.917, -8.942, -82.309, 0.035, 0.020, 1.742, 0.561),
			new Segment(1.492, 1.706, -10.580, -81.907, 0.087, 0.020, 1.776, 0.563),
			new Segment(1.521, 1.466, -12.001, -71.056, 0.147, 0.020, 1.805, 0.566),
			new Segment(1.545, 1.208, -12.871, -43.498, 0.213, 0.020, 1.829, 0.571),
			new Segment(1.564, 0.954, -12.730, 7.047, 0.287, 0.020, 1.847, 0.575),
			new Segment(1.579, 0.732, -11.066, 83.222, 0.367, 0.020, 1.861, 0.580),
			new Segment(1.590, 0.582, -7.527, 176.947, 0.452, 0.020, 1.872, 0.585),
			new Segment(1.601, 0.539, -2.130, 269.838, 0.540, 0.020, 1.881, 0.590),
			new Segment(1.614, 0.628, 4.450, 329.024, 0.627, 0.020, 1.892, 0.597),
			new Segment(1.631, 0.848, 11.004, 327.705, 0.711, 0.020, 1.905, 0.607),
			new Segment(1.654, 1.175, 16.332, 266.363, 0.789, 0.020, 1.922, 0.623),
			new Segment(1.686, 1.569, 19.715, 169.181, 0.860, 0.020, 1.943, 0.646),
			new Segment(1.725, 1.991, 21.074, 67.920, 0.923, 0.020, 1.968, 0.677),
			new Segment(1.773, 2.406, 20.762, -15.590, 0.979, 0.020, 1.996, 0.717),
			new Segment(1.829, 2.789, 19.173, -79.461, 1.026, 0.020, 2.026, 0.764),
			new Segment(1.892, 3.128, 16.921, -112.601, 1.066, 0.020, 2.057, 0.818),
			new Segment(1.960, 3.419, 14.569, -117.569, 1.100, 0.020, 2.089, 0.878),
			new Segment(2.033, 3.664, 12.226, -117.164, 1.128, 0.020, 2.122, 0.944),
			new Segment(2.111, 3.864, 10.008, -110.907, 1.151, 0.020, 2.154, 1.014),
			new Segment(2.191, 4.023, 7.962, -102.277, 1.170, 0.020, 2.186, 1.088),
			new Segment(2.274, 4.145, 6.097, -93.273, 1.184, 0.020, 2.218, 1.165),
			new Segment(2.359, 4.233, 4.398, -84.929, 1.196, 0.020, 2.249, 1.243),
			new Segment(2.445, 4.291, 2.881, -75.847, 1.204, 0.020, 2.280, 1.323),
			new Segment(2.531, 4.326, 1.751, -56.516, 1.209, 0.020, 2.311, 1.404),
			new Segment(2.618, 4.345, 0.976, -38.733, 1.212, 0.020, 2.342, 1.485),
			new Segment(2.705, 4.352, 0.321, -32.783, 1.213, 0.020, 2.372, 1.567),
			new Segment(2.792, 4.347, -0.242, -28.149, 1.212, 0.020, 2.403, 1.648),
			new Segment(2.879, 4.332, -0.734, -24.582, 1.209, 0.020, 2.433, 1.729),
			new Segment(2.965, 4.309, -1.171, -21.878, 1.205, 0.020, 2.464, 1.810),
			new Segment(3.050, 4.277, -1.569, -19.873, 1.199, 0.020, 2.495, 1.890),
			new Segment(3.135, 4.238, -1.937, -18.428, 1.193, 0.020, 2.526, 1.969),
			new Segment(3.219, 4.193, -2.286, -17.429, 1.185, 0.020, 2.557, 2.047),
			new Segment(3.302, 4.140, -2.622, -16.775, 1.176, 0.020, 2.588, 2.123),
			new Segment(3.383, 4.081, -2.949, -16.377, 1.166, 0.020, 2.620, 2.198),
			new Segment(3.464, 4.016, -3.272, -16.152, 1.156, 0.020, 2.652, 2.272),
			new Segment(3.543, 3.944, -3.593, -16.026, 1.145, 0.020, 2.684, 2.344),
			new Segment(3.620, 3.866, -3.911, -15.928, 1.134, 0.020, 2.717, 2.414),
			new Segment(3.696, 3.781, -4.227, -15.796, 1.122, 0.020, 2.749, 2.483),
			new Segment(3.769, 3.690, -4.539, -15.573, 1.110, 0.020, 2.782, 2.549),
			new Segment(3.841, 3.594, -4.843, -15.213, 1.098, 0.020, 2.814, 2.613),
			new Segment(3.911, 3.491, -5.136, -14.681, 1.087, 0.020, 2.846, 2.675),
			new Segment(3.979, 3.383, -5.416, -13.954, 1.075, 0.020, 2.878, 2.735),
			new Segment(4.044, 3.269, -5.676, -13.023, 1.064, 0.020, 2.909, 2.792),
			new Segment(4.107, 3.151, -5.914, -11.893, 1.053, 0.020, 2.940, 2.847),
			new Segment(4.168, 3.028, -6.125, -10.580, 1.043, 0.020, 2.970, 2.899),
			new Segment(4.226, 2.902, -6.308, -9.113, 1.033, 0.020, 3.000, 2.949),
			new Segment(4.281, 2.773, -6.458, -7.528, 1.023, 0.020, 3.029, 2.997),
			new Segment(4.334, 2.641, -6.576, -5.867, 1.015, 0.020, 3.056, 3.042),
			new Segment(4.384, 2.508, -6.659, -4.176, 1.007, 0.020, 3.083, 3.084),
			new Segment(4.432, 2.374, -6.709, -2.499, 1.000, 0.020, 3.108, 3.124),
			new Segment(4.476, 2.240, -6.727, -0.879, 0.993, 0.020, 3.133, 3.162),
			new Segment(4.518, 2.105, -6.714, 0.646, 0.988, 0.020, 3.156, 3.197),
			new Segment(4.558, 1.972, -6.673, 2.043, 0.982, 0.020, 3.178, 3.230),
			new Segment(4.595, 1.840, -6.607, 3.287, 0.978, 0.020, 3.198, 3.261),
			new Segment(4.629, 1.709, -6.520, 4.357, 0.974, 0.020, 3.217, 3.289),
			new Segment(4.661, 1.581, -6.415, 5.243, 0.971, 0.020, 3.235, 3.315),
			new Segment(4.690, 1.455, -6.296, 5.936, 0.968, 0.020, 3.252, 3.339),
			new Segment(4.716, 1.332, -6.168, 6.436, 0.966, 0.020, 3.267, 3.361),
			new Segment(4.740, 1.211, -6.033, 6.747, 0.964, 0.020, 3.280, 3.381),
			new Segment(4.762, 1.093, -5.895, 6.876, 0.963, 0.020, 3.293, 3.399),
			new Segment(4.782, 0.978, -5.759, 6.835, 0.962, 0.020, 3.304, 3.415),
			new Segment(4.799, 0.865, -5.626, 6.636, 0.961, 0.020, 3.314, 3.429),
			new Segment(4.814, 0.755, -5.500, 6.293, 0.961, 0.020, 3.323, 3.442),
			new Segment(4.827, 0.648, -5.384, 5.824, 0.960, 0.020, 3.330, 3.452),
			new Segment(4.838, 0.542, -5.279, 5.244, 0.960, 0.020, 3.336, 3.461),
			new Segment(4.847, 0.439, -5.147, 6.589, 0.960, 0.020, 3.341, 3.468),
			new Segment(4.854, 0.344, -4.753, 19.691, 0.960, 0.020, 3.345, 3.474),
			new Segment(4.859, 0.261, -4.142, 30.537, 0.960, 0.020, 3.348, 3.478),
			new Segment(4.863, 0.190, -3.551, 29.561, 0.960, 0.020, 3.350, 3.481),
			new Segment(4.865, 0.131, -2.975, 28.813, 0.960, 0.020, 3.352, 3.483),
			new Segment(4.867, 0.083, -2.409, 28.271, 0.960, 0.020, 3.353, 3.485),
			new Segment(4.868, 0.046, -1.851, 27.906, 0.960, 0.020, 3.353, 3.486),
			new Segment(4.868, 0.020, -1.298, 27.685, 0.960, 0.020, 3.354, 3.486),
			new Segment(4.868, 0.005, -0.746, 27.573, 0.960, 0.020, 3.354, 3.486),
			new Segment(4.868, 0.000, -0.235, 25.538, 0.960, 0.020, 3.354, 3.486),
			new Segment(4.868, 0.000, -0.235, 25.538, 0.960, 0.020, 3.354, 3.486)}),

		// Right wheel Trajectory
		new Trajectory(new Segment[]{
			new Segment(0.000, 0.011, 0.550, 27.522, 5.934, 0.020, -0.339, -0.933),
			new Segment(0.001, 0.022, 0.551, 0.003, 5.934, 0.020, -0.339, -0.933),
			new Segment(0.002, 0.050, 1.377, 41.300, 5.934, 0.020, -0.338, -0.933),
			new Segment(0.003, 0.088, 1.928, 27.574, 5.934, 0.020, -0.336, -0.934),
			new Segment(0.006, 0.138, 2.481, 27.641, 5.934, 0.020, -0.334, -0.935),
			new Segment(0.010, 0.198, 3.036, 27.751, 5.934, 0.020, -0.330, -0.936),
			new Segment(0.015, 0.270, 3.594, 27.914, 5.934, 0.020, -0.325, -0.938),
			new Segment(0.023, 0.353, 4.157, 28.138, 5.934, 0.020, -0.318, -0.940),
			new Segment(0.031, 0.448, 4.726, 28.435, 5.934, 0.020, -0.310, -0.943),
			new Segment(0.042, 0.548, 5.025, 14.949, 5.934, 0.020, -0.300, -0.947),
			new Segment(0.055, 0.650, 5.052, 1.395, 5.934, 0.020, -0.287, -0.952),
			new Segment(0.070, 0.751, 5.085, 1.634, 5.935, 0.020, -0.273, -0.957),
			new Segment(0.088, 0.854, 5.123, 1.869, 5.935, 0.020, -0.257, -0.963),
			new Segment(0.107, 0.957, 5.164, 2.099, 5.935, 0.020, -0.239, -0.969),
			new Segment(0.128, 1.061, 5.211, 2.326, 5.936, 0.020, -0.219, -0.976),
			new Segment(0.151, 1.166, 5.262, 2.552, 5.936, 0.020, -0.197, -0.984),
			new Segment(0.177, 1.273, 5.318, 2.778, 5.937, 0.020, -0.173, -0.993),
			new Segment(0.204, 1.380, 5.378, 3.009, 5.938, 0.020, -0.147, -1.002),
			new Segment(0.234, 1.489, 5.443, 3.247, 5.939, 0.020, -0.119, -1.012),
			new Segment(0.266, 1.599, 5.513, 3.497, 5.940, 0.020, -0.089, -1.023),
			new Segment(0.300, 1.711, 5.588, 3.764, 5.941, 0.020, -0.057, -1.035),
			new Segment(0.337, 1.825, 5.669, 4.054, 5.943, 0.020, -0.023, -1.047),
			new Segment(0.376, 1.940, 5.757, 4.374, 5.945, 0.020, 0.014, -1.060),
			new Segment(0.417, 2.057, 5.851, 4.733, 5.948, 0.020, 0.053, -1.073),
			new Segment(0.460, 2.176, 5.954, 5.140, 5.951, 0.020, 0.094, -1.088),
			new Segment(0.506, 2.297, 6.066, 5.605, 5.954, 0.020, 0.137, -1.102),
			new Segment(0.555, 2.421, 6.189, 6.141, 5.958, 0.020, 0.183, -1.118),
			new Segment(0.606, 2.547, 6.324, 6.764, 5.963, 0.020, 0.232, -1.134),
			new Segment(0.659, 2.677, 6.474, 7.492, 5.968, 0.020, 0.282, -1.151),
			new Segment(0.715, 2.810, 6.641, 8.345, 5.973, 0.020, 0.336, -1.168),
			new Segment(0.774, 2.946, 6.828, 9.350, 5.980, 0.020, 0.392, -1.186),
			new Segment(0.836, 3.087, 7.039, 10.537, 5.987, 0.020, 0.451, -1.204),
			new Segment(0.901, 3.233, 7.277, 11.942, 5.995, 0.020, 0.513, -1.223),
			new Segment(0.968, 3.384, 7.550, 13.611, 6.005, 0.020, 0.578, -1.242),
			new Segment(1.039, 3.541, 7.862, 15.596, 6.015, 0.020, 0.646, -1.261),
			new Segment(1.113, 3.705, 8.221, 17.962, 6.027, 0.020, 0.718, -1.280),
			new Segment(1.191, 3.878, 8.637, 20.784, 6.040, 0.020, 0.793, -1.299),
			new Segment(1.272, 4.060, 9.120, 24.150, 6.055, 0.020, 0.872, -1.318),
			new Segment(1.357, 4.254, 9.683, 28.158, 6.072, 0.020, 0.955, -1.337),
			new Segment(1.446, 4.461, 10.341, 32.913, 6.091, 0.020, 1.042, -1.355),
			new Segment(1.540, 4.683, 11.111, 38.517, 6.112, 0.020, 1.134, -1.372),
			new Segment(1.638, 4.923, 12.012, 45.038, 6.137, 0.020, 1.232, -1.387),
			new Segment(1.742, 5.184, 13.062, 52.475, 6.164, 0.020, 1.334, -1.401),
			new Segment(1.851, 5.470, 14.275, 60.667, 6.196, 0.020, 1.443, -1.412),
			new Segment(1.967, 5.783, 15.658, 69.153, 6.231, 0.020, 1.558, -1.420),
			new Segment(2.090, 6.127, 17.197, 76.946, 6.272, 0.020, 1.681, -1.424),
			new Segment(2.220, 6.504, 18.841, 82.197, 0.035, 0.020, 1.811, -1.423),
			new Segment(2.358, 6.913, 20.476, 81.769, 0.087, 0.020, 1.949, -1.414),
			new Segment(2.505, 7.351, 21.894, 70.897, 0.147, 0.020, 2.095, -1.397),
			new Segment(2.661, 7.807, 22.761, 43.335, 0.213, 0.020, 2.249, -1.369),
			new Segment(2.826, 8.259, 22.617, -7.176, 0.287, 0.020, 2.409, -1.328),
			new Segment(3.000, 8.678, 20.952, -83.259, 0.367, 0.020, 2.573, -1.273),
			new Segment(3.180, 9.015, 16.866, -204.323, 0.452, 0.020, 2.739, -1.201),
			new Segment(3.365, 9.223, 10.375, -324.512, 0.540, 0.020, 2.901, -1.113),
			new Segment(3.550, 9.277, 2.704, -383.547, 0.627, 0.020, 3.056, -1.011),
			new Segment(3.734, 9.178, -4.940, -382.217, 0.711, 0.020, 3.200, -0.897),
			new Segment(3.913, 8.951, -11.360, -321.005, 0.789, 0.020, 3.331, -0.775),
			new Segment(4.085, 8.634, -15.840, -224.021, 0.860, 0.020, 3.448, -0.648),
			new Segment(4.251, 8.268, -18.299, -122.945, 0.923, 0.020, 3.552, -0.520),
			new Segment(4.408, 7.885, -19.170, -43.543, 0.979, 0.020, 3.643, -0.391),
			new Segment(4.558, 7.498, -19.315, -7.245, 1.026, 0.020, 3.724, -0.265),
			new Segment(4.701, 7.124, -18.718, 29.861, 1.066, 0.020, 3.795, -0.141),
			new Segment(4.836, 6.775, -17.471, 62.361, 1.100, 0.020, 3.858, -0.022),
			new Segment(4.965, 6.450, -16.231, 61.985, 1.128, 0.020, 3.915, 0.094),
			new Segment(5.088, 6.148, -15.116, 55.757, 1.151, 0.020, 3.967, 0.206),
			new Segment(5.206, 5.864, -14.173, 47.152, 1.170, 0.020, 4.013, 0.313),
			new Segment(5.318, 5.596, -13.409, 38.168, 1.184, 0.020, 4.056, 0.417),
			new Segment(5.424, 5.340, -12.813, 29.839, 1.196, 0.020, 4.096, 0.516),
			new Segment(5.526, 5.093, -12.318, 24.755, 1.204, 0.020, 4.133, 0.611),
			new Segment(5.623, 4.860, -11.658, 32.955, 1.209, 0.020, 4.168, 0.702),
			new Segment(5.716, 4.643, -10.884, 38.716, 1.212, 0.020, 4.200, 0.789),
			new Segment(5.805, 4.438, -10.229, 32.772, 1.213, 0.020, 4.231, 0.872),
			new Segment(5.890, 4.245, -9.666, 28.141, 1.212, 0.020, 4.261, 0.951),
			new Segment(5.971, 4.061, -9.174, 24.576, 1.209, 0.020, 4.290, 1.027),
			new Segment(6.049, 3.886, -8.737, 21.875, 1.205, 0.020, 4.317, 1.100),
			new Segment(6.123, 3.720, -8.339, 19.871, 1.199, 0.020, 4.344, 1.169),
			new Segment(6.194, 3.560, -7.971, 18.427, 1.193, 0.020, 4.370, 1.236),
			new Segment(6.263, 3.408, -7.622, 17.429, 1.185, 0.020, 4.396, 1.299),
			new Segment(6.328, 3.262, -7.287, 16.776, 1.176, 0.020, 4.420, 1.359),
			new Segment(6.390, 3.123, -6.959, 16.378, 1.166, 0.020, 4.445, 1.417),
			new Segment(6.450, 2.990, -6.636, 16.154, 1.156, 0.020, 4.469, 1.472),
			new Segment(6.507, 2.864, -6.316, 16.028, 1.145, 0.020, 4.492, 1.524),
			new Segment(6.562, 2.744, -5.997, 15.930, 1.134, 0.020, 4.515, 1.574),
			new Segment(6.615, 2.630, -5.681, 15.798, 1.122, 0.020, 4.537, 1.621),
			new Segment(6.665, 2.523, -5.369, 15.575, 1.110, 0.020, 4.560, 1.667),
			new Segment(6.714, 2.422, -5.065, 15.215, 1.098, 0.020, 4.581, 1.710),
			new Segment(6.760, 2.326, -4.772, 14.683, 1.087, 0.020, 4.603, 1.751),
			new Segment(6.805, 2.236, -4.492, 13.956, 1.075, 0.020, 4.624, 1.791),
			new Segment(6.848, 2.152, -4.232, 13.024, 1.064, 0.020, 4.645, 1.828),
			new Segment(6.890, 2.072, -3.994, 11.894, 1.053, 0.020, 4.665, 1.864),
			new Segment(6.929, 1.996, -3.782, 10.581, 1.043, 0.020, 4.685, 1.899),
			new Segment(6.968, 1.924, -3.600, 9.113, 1.033, 0.020, 4.704, 1.932),
			new Segment(7.005, 1.855, -3.450, 7.528, 1.023, 0.020, 4.724, 1.964),
			new Segment(7.041, 1.788, -3.332, 5.867, 1.015, 0.020, 4.742, 1.994),
			new Segment(7.075, 1.724, -3.249, 4.175, 1.007, 0.020, 4.761, 2.024),
			new Segment(7.108, 1.660, -3.199, 2.498, 1.000, 0.020, 4.778, 2.052),
			new Segment(7.140, 1.596, -3.181, 0.878, 0.993, 0.020, 4.796, 2.078),
			new Segment(7.171, 1.532, -3.194, -0.646, 0.988, 0.020, 4.813, 2.104),
			new Segment(7.200, 1.467, -3.235, -2.044, 0.982, 0.020, 4.829, 2.128),
			new Segment(7.228, 1.401, -3.301, -3.287, 0.978, 0.020, 4.844, 2.152),
			new Segment(7.255, 1.334, -3.388, -4.358, 0.974, 0.020, 4.859, 2.174),
			new Segment(7.280, 1.264, -3.493, -5.243, 0.971, 0.020, 4.874, 2.195),
			new Segment(7.304, 1.191, -3.612, -5.936, 0.968, 0.020, 4.887, 2.214),
			new Segment(7.326, 1.117, -3.740, -6.437, 0.966, 0.020, 4.900, 2.233),
			new Segment(7.347, 1.039, -3.875, -6.747, 0.964, 0.020, 4.912, 2.250),
			new Segment(7.366, 0.959, -4.013, -6.877, 0.963, 0.020, 4.922, 2.266),
			new Segment(7.384, 0.876, -4.149, -6.835, 0.962, 0.020, 4.933, 2.280),
			new Segment(7.400, 0.790, -4.282, -6.636, 0.961, 0.020, 4.942, 2.293),
			new Segment(7.414, 0.702, -4.408, -6.293, 0.961, 0.020, 4.950, 2.304),
			new Segment(7.426, 0.612, -4.525, -5.824, 0.960, 0.020, 4.957, 2.314),
			new Segment(7.436, 0.519, -4.629, -5.244, 0.960, 0.020, 4.963, 2.323),
			new Segment(7.445, 0.425, -4.681, -2.604, 0.960, 0.020, 4.967, 2.330),
			new Segment(7.452, 0.337, -4.445, 11.816, 0.960, 0.020, 4.971, 2.335),
			new Segment(7.457, 0.257, -3.955, 24.508, 0.960, 0.020, 4.974, 2.340),
			new Segment(7.461, 0.188, -3.445, 25.484, 0.960, 0.020, 4.976, 2.343),
			new Segment(7.463, 0.130, -2.921, 26.232, 0.960, 0.020, 4.978, 2.345),
			new Segment(7.465, 0.082, -2.385, 26.774, 0.960, 0.020, 4.979, 2.346),
			new Segment(7.466, 0.046, -1.842, 27.139, 0.960, 0.020, 4.979, 2.347),
			new Segment(7.466, 0.020, -1.295, 27.360, 0.960, 0.020, 4.980, 2.347),
			new Segment(7.466, 0.005, -0.746, 27.472, 0.960, 0.020, 4.980, 2.347),
			new Segment(7.466, 0.000, -0.235, 25.522, 0.960, 0.020, 4.980, 2.347),
			new Segment(7.466, 0.000, -0.235, 25.522, 0.960, 0.020, 4.980, 2.347)})
		};

}
