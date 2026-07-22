# Changelog

## [5.21.0] - 2026-07-22

## [5.20.0] - 2026-07-21
### Added
- **`Entity.getKinematics()`** and **`Entity.Builder.kinematics()`** — supply higher-granularity kinematics data, preferred for Track Entities over `location`/`locationUncertainty`.
- **`Kinematics`**, **`KinematicsGeodetic`**, and **`KinematicsGeocentric`** — new types conveying location, velocity, acceleration, attitude, and measurement time in geodetic and geocentric (ECEF) reference frames.
- **`LocationGeodetic`** and **`LocationGeocentricEcef`** — new types for WGS84 geodetic and Earth-centered Earth-fixed coordinates.
- **`Altitude`** and datum-specific altitude types (above ground level, mean sea level EGM96/pressure, sea floor, standard datum plane, WGS84 ellipsoid, below sea surface) — represent altitude across multiple reference datums.
- **`AltitudeProvenance`**, **`AltitudeProvenanceSourceType`**, **`TMat3`**, and **`Vec3`** — describe altitude sourcing (barometer, GNSS, sonar, etc.) plus supporting 3D vector and 3x3 covariance matrix types.

## [5.19.0] - 2026-07-16

