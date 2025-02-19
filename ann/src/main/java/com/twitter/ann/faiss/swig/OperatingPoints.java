// 
//             ඞ ELON SUS ඞ
// ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣤⣤⣤⣤⣶⣦⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡿⠛⠉⠙⠛⠛⠛⠛⠻⢿⣿⣷⣤⡀⠀⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠋⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⠈⢻⣿⣿⡄⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣸⣿⡏⠀⠀⠀⣠⣶⣾⣿⣿⣿⠿⠿⠿⢿⣿⣿⣿⣄⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⣿⠁⠀⠀⢰⣿⣿⣯⠁⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣷⡄⠀
// ⠀⠀⣀⣤⣴⣶⣶⣿⡟⠀⠀⠀⢸⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣷⠀
// ⠀⢰⣿⡟⠋⠉⣹⣿⡇⠀⠀⠀⠘⣿⣿⣿⣿⣷⣦⣤⣤⣤⣶⣶⣶⣶⣿⣿⣿⠀
// ⠀⢸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠀
// ⠀⣸⣿⡇⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠉⠻⠿⣿⣿⣿⣿⡿⠿⠿⠛⢻⣿⡇⠀⠀
// ⠀⣿⣿⠁⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣧⠀⠀
// ⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀
// ⠀⣿⣿⠀⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⠀⠀
// ⠀⢿⣿⡆⠀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀
// ⠀⠸⣿⣧⡀⠀⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠃⠀⠀
// ⠀⠀⠛⢿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⣰⣿⣿⣷⣶⣶⣶⣶⠶⠀⢠⣿⣿⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⣽⣿⡏⠁⠀⠀⢸⣿⡇⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⠀⣿⣿⡇⠀⢹⣿⡆⠀⠀⠀⣸⣿⠇⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⢿⣿⣦⣄⣀⣠⣴⣿⣿⠁⠀⠈⠻⣿⣿⣿⣿⡿⠏⠀⠀⠀⠀
// ⠀⠀⠀⠀⠀⠀⠀⠈⠛⠻⠿⠿⠿⠿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
// 
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.twitter.ann.faiss;

public class OperatingPoints {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OperatingPoints(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OperatingPoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_OperatingPoints(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAll_pts(OperatingPointVector value) {
    swigfaissJNI.OperatingPoints_all_pts_set(swigCPtr, this, OperatingPointVector.getCPtr(value), value);
  }

  public OperatingPointVector getAll_pts() {
    long cPtr = swigfaissJNI.OperatingPoints_all_pts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OperatingPointVector(cPtr, false);
  }

  public void setOptimal_pts(OperatingPointVector value) {
    swigfaissJNI.OperatingPoints_optimal_pts_set(swigCPtr, this, OperatingPointVector.getCPtr(value), value);
  }

  public OperatingPointVector getOptimal_pts() {
    long cPtr = swigfaissJNI.OperatingPoints_optimal_pts_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OperatingPointVector(cPtr, false);
  }

  public OperatingPoints() {
    this(swigfaissJNI.new_OperatingPoints(), true);
  }

  public int merge_with(OperatingPoints other, String prefix) {
    return swigfaissJNI.OperatingPoints_merge_with__SWIG_0(swigCPtr, this, OperatingPoints.getCPtr(other), other, prefix);
  }

  public int merge_with(OperatingPoints other) {
    return swigfaissJNI.OperatingPoints_merge_with__SWIG_1(swigCPtr, this, OperatingPoints.getCPtr(other), other);
  }

  public void clear() {
    swigfaissJNI.OperatingPoints_clear(swigCPtr, this);
  }

  public boolean add(double perf, double t, String key, long cno) {
    return swigfaissJNI.OperatingPoints_add__SWIG_0(swigCPtr, this, perf, t, key, cno);
  }

  public boolean add(double perf, double t, String key) {
    return swigfaissJNI.OperatingPoints_add__SWIG_1(swigCPtr, this, perf, t, key);
  }

  public double t_for_perf(double perf) {
    return swigfaissJNI.OperatingPoints_t_for_perf(swigCPtr, this, perf);
  }

  public void display(boolean only_optimal) {
    swigfaissJNI.OperatingPoints_display__SWIG_0(swigCPtr, this, only_optimal);
  }

  public void display() {
    swigfaissJNI.OperatingPoints_display__SWIG_1(swigCPtr, this);
  }

  public void all_to_gnuplot(String fname) {
    swigfaissJNI.OperatingPoints_all_to_gnuplot(swigCPtr, this, fname);
  }

  public void optimal_to_gnuplot(String fname) {
    swigfaissJNI.OperatingPoints_optimal_to_gnuplot(swigCPtr, this, fname);
  }

}
