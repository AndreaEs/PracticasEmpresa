/* LIBGIMP - The GIMP Library
 * Copyright (C) 1995-2003 Peter Mattis and Spencer Kimball
 *
 * gimpdrawabletransform_pdb.c
 *
 * This library is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

/* NOTE: This file is auto-generated by pdbgen.pl */

#include "config.h"

#include "gimp.h"
#undef GIMP_DISABLE_DEPRECATED
#undef __GIMP_DRAWABLE_TRANSFORM_PDB_H__
#include "gimpdrawabletransform_pdb.h"


/**
 * SECTION: gimpdrawabletransform
 * @title: gimpdrawabletransform
 * @short_description: Functions to perform transformatrions on drawables.
 *
 * Functions to perform transformatrions on drawables.
 **/


/**
 * gimp_drawable_transform_flip_simple:
 * @drawable_ID: The affected drawable.
 * @flip_type: Type of flip.
 * @auto_center: Whether to automatically position the axis in the selection center.
 * @axis: coord. of flip axis.
 * @clip_result: Whether to clip results.
 *
 * Deprecated: Use gimp_item_transform_flip_simple() instead.
 *
 * Returns: The flipped drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_flip_simple (gint32              drawable_ID,
                                     GimpOrientationType flip_type,
                                     gboolean            auto_center,
                                     gdouble             axis,
                                     gboolean            clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-flip-simple",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_INT32, flip_type,
                                    GIMP_PDB_INT32, auto_center,
                                    GIMP_PDB_FLOAT, axis,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_flip:
 * @drawable_ID: The affected drawable.
 * @x0: horz. coord. of one end of axis.
 * @y0: vert. coord. of one end of axis.
 * @x1: horz. coord. of other end of axis.
 * @y1: vert. coord. of other end of axis.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: Whether to clip results.
 *
 * Deprecated: Use gimp_item_transform_flip() instead.
 *
 * Returns: The flipped drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_flip (gint32                 drawable_ID,
                              gdouble                x0,
                              gdouble                y0,
                              gdouble                x1,
                              gdouble                y1,
                              GimpTransformDirection transform_direction,
                              GimpInterpolationType  interpolation,
                              gboolean               supersample,
                              gint                   recursion_level,
                              gboolean               clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-flip",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, x0,
                                    GIMP_PDB_FLOAT, y0,
                                    GIMP_PDB_FLOAT, x1,
                                    GIMP_PDB_FLOAT, y1,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_flip_default:
 * @drawable_ID: The affected drawable.
 * @x0: horz. coord. of one end of axis.
 * @y0: vert. coord. of one end of axis.
 * @x1: horz. coord. of other end of axis.
 * @y1: vert. coord. of other end of axis.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: Whether to clip results.
 *
 * Deprecated: Use gimp_item_transform_flip() instead.
 *
 * Returns: The flipped drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_flip_default (gint32   drawable_ID,
                                      gdouble  x0,
                                      gdouble  y0,
                                      gdouble  x1,
                                      gdouble  y1,
                                      gboolean interpolate,
                                      gboolean clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-flip-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, x0,
                                    GIMP_PDB_FLOAT, y0,
                                    GIMP_PDB_FLOAT, x1,
                                    GIMP_PDB_FLOAT, y1,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_perspective:
 * @drawable_ID: The affected drawable.
 * @x0: The new x coordinate of upper-left corner of original bounding box.
 * @y0: The new y coordinate of upper-left corner of original bounding box.
 * @x1: The new x coordinate of upper-right corner of original bounding box.
 * @y1: The new y coordinate of upper-right corner of original bounding box.
 * @x2: The new x coordinate of lower-left corner of original bounding box.
 * @y2: The new y coordinate of lower-left corner of original bounding box.
 * @x3: The new x coordinate of lower-right corner of original bounding box.
 * @y3: The new y coordinate of lower-right corner of original bounding box.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_perspective() instead.
 *
 * Returns: The newly mapped drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_perspective (gint32                 drawable_ID,
                                     gdouble                x0,
                                     gdouble                y0,
                                     gdouble                x1,
                                     gdouble                y1,
                                     gdouble                x2,
                                     gdouble                y2,
                                     gdouble                x3,
                                     gdouble                y3,
                                     GimpTransformDirection transform_direction,
                                     GimpInterpolationType  interpolation,
                                     gboolean               supersample,
                                     gint                   recursion_level,
                                     GimpTransformResize    clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-perspective",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, x0,
                                    GIMP_PDB_FLOAT, y0,
                                    GIMP_PDB_FLOAT, x1,
                                    GIMP_PDB_FLOAT, y1,
                                    GIMP_PDB_FLOAT, x2,
                                    GIMP_PDB_FLOAT, y2,
                                    GIMP_PDB_FLOAT, x3,
                                    GIMP_PDB_FLOAT, y3,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_perspective_default:
 * @drawable_ID: The affected drawable.
 * @x0: The new x coordinate of upper-left corner of original bounding box.
 * @y0: The new y coordinate of upper-left corner of original bounding box.
 * @x1: The new x coordinate of upper-right corner of original bounding box.
 * @y1: The new y coordinate of upper-right corner of original bounding box.
 * @x2: The new x coordinate of lower-left corner of original bounding box.
 * @y2: The new y coordinate of lower-left corner of original bounding box.
 * @x3: The new x coordinate of lower-right corner of original bounding box.
 * @y3: The new y coordinate of lower-right corner of original bounding box.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_perspective() instead.
 *
 * Returns: The newly mapped drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_perspective_default (gint32              drawable_ID,
                                             gdouble             x0,
                                             gdouble             y0,
                                             gdouble             x1,
                                             gdouble             y1,
                                             gdouble             x2,
                                             gdouble             y2,
                                             gdouble             x3,
                                             gdouble             y3,
                                             gboolean            interpolate,
                                             GimpTransformResize clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-perspective-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, x0,
                                    GIMP_PDB_FLOAT, y0,
                                    GIMP_PDB_FLOAT, x1,
                                    GIMP_PDB_FLOAT, y1,
                                    GIMP_PDB_FLOAT, x2,
                                    GIMP_PDB_FLOAT, y2,
                                    GIMP_PDB_FLOAT, x3,
                                    GIMP_PDB_FLOAT, y3,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_rotate_simple:
 * @drawable_ID: The affected drawable.
 * @rotate_type: Type of rotation.
 * @auto_center: Whether to automatically rotate around the selection center.
 * @center_x: The hor. coordinate of the center of rotation.
 * @center_y: The vert. coordinate of the center of rotation.
 * @clip_result: Whether to clip results.
 *
 * Deprecated: Use gimp_item_transform_rotate_simple() instead.
 *
 * Returns: The rotated drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_rotate_simple (gint32           drawable_ID,
                                       GimpRotationType rotate_type,
                                       gboolean         auto_center,
                                       gint             center_x,
                                       gint             center_y,
                                       gboolean         clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-rotate-simple",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_INT32, rotate_type,
                                    GIMP_PDB_INT32, auto_center,
                                    GIMP_PDB_INT32, center_x,
                                    GIMP_PDB_INT32, center_y,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_rotate:
 * @drawable_ID: The affected drawable.
 * @angle: The angle of rotation (radians).
 * @auto_center: Whether to automatically rotate around the selection center.
 * @center_x: The hor. coordinate of the center of rotation.
 * @center_y: The vert. coordinate of the center of rotation.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_rotate() instead.
 *
 * Returns: The rotated drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_rotate (gint32                 drawable_ID,
                                gdouble                angle,
                                gboolean               auto_center,
                                gint                   center_x,
                                gint                   center_y,
                                GimpTransformDirection transform_direction,
                                GimpInterpolationType  interpolation,
                                gboolean               supersample,
                                gint                   recursion_level,
                                GimpTransformResize    clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-rotate",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, angle,
                                    GIMP_PDB_INT32, auto_center,
                                    GIMP_PDB_INT32, center_x,
                                    GIMP_PDB_INT32, center_y,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_rotate_default:
 * @drawable_ID: The affected drawable.
 * @angle: The angle of rotation (radians).
 * @auto_center: Whether to automatically rotate around the selection center.
 * @center_x: The hor. coordinate of the center of rotation.
 * @center_y: The vert. coordinate of the center of rotation.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_rotate() instead.
 *
 * Returns: The rotated drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_rotate_default (gint32              drawable_ID,
                                        gdouble             angle,
                                        gboolean            auto_center,
                                        gint                center_x,
                                        gint                center_y,
                                        gboolean            interpolate,
                                        GimpTransformResize clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-rotate-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, angle,
                                    GIMP_PDB_INT32, auto_center,
                                    GIMP_PDB_INT32, center_x,
                                    GIMP_PDB_INT32, center_y,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_scale:
 * @drawable_ID: The affected drawable.
 * @x0: The new x coordinate of the upper-left corner of the scaled region.
 * @y0: The new y coordinate of the upper-left corner of the scaled region.
 * @x1: The new x coordinate of the lower-right corner of the scaled region.
 * @y1: The new y coordinate of the lower-right corner of the scaled region.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_scale() instead.
 *
 * Returns: The scaled drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_scale (gint32                 drawable_ID,
                               gdouble                x0,
                               gdouble                y0,
                               gdouble                x1,
                               gdouble                y1,
                               GimpTransformDirection transform_direction,
                               GimpInterpolationType  interpolation,
                               gboolean               supersample,
                               gint                   recursion_level,
                               GimpTransformResize    clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-scale",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, x0,
                                    GIMP_PDB_FLOAT, y0,
                                    GIMP_PDB_FLOAT, x1,
                                    GIMP_PDB_FLOAT, y1,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_scale_default:
 * @drawable_ID: The affected drawable.
 * @x0: The new x coordinate of the upper-left corner of the scaled region.
 * @y0: The new y coordinate of the upper-left corner of the scaled region.
 * @x1: The new x coordinate of the lower-right corner of the scaled region.
 * @y1: The new y coordinate of the lower-right corner of the scaled region.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_scale() instead.
 *
 * Returns: The scaled drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_scale_default (gint32              drawable_ID,
                                       gdouble             x0,
                                       gdouble             y0,
                                       gdouble             x1,
                                       gdouble             y1,
                                       gboolean            interpolate,
                                       GimpTransformResize clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-scale-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, x0,
                                    GIMP_PDB_FLOAT, y0,
                                    GIMP_PDB_FLOAT, x1,
                                    GIMP_PDB_FLOAT, y1,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_shear:
 * @drawable_ID: The affected drawable.
 * @shear_type: Type of shear.
 * @magnitude: The magnitude of the shear.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_shear() instead.
 *
 * Returns: The sheared drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_shear (gint32                 drawable_ID,
                               GimpOrientationType    shear_type,
                               gdouble                magnitude,
                               GimpTransformDirection transform_direction,
                               GimpInterpolationType  interpolation,
                               gboolean               supersample,
                               gint                   recursion_level,
                               GimpTransformResize    clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-shear",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_INT32, shear_type,
                                    GIMP_PDB_FLOAT, magnitude,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_shear_default:
 * @drawable_ID: The affected drawable.
 * @shear_type: Type of shear.
 * @magnitude: The magnitude of the shear.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_shear() instead.
 *
 * Returns: The sheared drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_shear_default (gint32              drawable_ID,
                                       GimpOrientationType shear_type,
                                       gdouble             magnitude,
                                       gboolean            interpolate,
                                       GimpTransformResize clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-shear-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_INT32, shear_type,
                                    GIMP_PDB_FLOAT, magnitude,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_2d:
 * @drawable_ID: The affected drawable.
 * @source_x: X coordinate of the transformation center.
 * @source_y: Y coordinate of the transformation center.
 * @scale_x: Amount to scale in x direction.
 * @scale_y: Amount to scale in y direction.
 * @angle: The angle of rotation (radians).
 * @dest_x: X coordinate of where the center goes.
 * @dest_y: Y coordinate of where the center goes.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_2d() instead.
 *
 * Returns: The transformed drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_2d (gint32                 drawable_ID,
                            gdouble                source_x,
                            gdouble                source_y,
                            gdouble                scale_x,
                            gdouble                scale_y,
                            gdouble                angle,
                            gdouble                dest_x,
                            gdouble                dest_y,
                            GimpTransformDirection transform_direction,
                            GimpInterpolationType  interpolation,
                            gboolean               supersample,
                            gint                   recursion_level,
                            GimpTransformResize    clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-2d",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, source_x,
                                    GIMP_PDB_FLOAT, source_y,
                                    GIMP_PDB_FLOAT, scale_x,
                                    GIMP_PDB_FLOAT, scale_y,
                                    GIMP_PDB_FLOAT, angle,
                                    GIMP_PDB_FLOAT, dest_x,
                                    GIMP_PDB_FLOAT, dest_y,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_2d_default:
 * @drawable_ID: The affected drawable.
 * @source_x: X coordinate of the transformation center.
 * @source_y: Y coordinate of the transformation center.
 * @scale_x: Amount to scale in x direction.
 * @scale_y: Amount to scale in y direction.
 * @angle: The angle of rotation (radians).
 * @dest_x: X coordinate of where the center goes.
 * @dest_y: Y coordinate of where the center goes.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_2d() instead.
 *
 * Returns: The transformed drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_2d_default (gint32              drawable_ID,
                                    gdouble             source_x,
                                    gdouble             source_y,
                                    gdouble             scale_x,
                                    gdouble             scale_y,
                                    gdouble             angle,
                                    gdouble             dest_x,
                                    gdouble             dest_y,
                                    gboolean            interpolate,
                                    GimpTransformResize clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-2d-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, source_x,
                                    GIMP_PDB_FLOAT, source_y,
                                    GIMP_PDB_FLOAT, scale_x,
                                    GIMP_PDB_FLOAT, scale_y,
                                    GIMP_PDB_FLOAT, angle,
                                    GIMP_PDB_FLOAT, dest_x,
                                    GIMP_PDB_FLOAT, dest_y,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_matrix:
 * @drawable_ID: The affected drawable.
 * @coeff_0_0: coefficient (0,0) of the transformation matrix.
 * @coeff_0_1: coefficient (0,1) of the transformation matrix.
 * @coeff_0_2: coefficient (0,2) of the transformation matrix.
 * @coeff_1_0: coefficient (1,0) of the transformation matrix.
 * @coeff_1_1: coefficient (1,1) of the transformation matrix.
 * @coeff_1_2: coefficient (1,2) of the transformation matrix.
 * @coeff_2_0: coefficient (2,0) of the transformation matrix.
 * @coeff_2_1: coefficient (2,1) of the transformation matrix.
 * @coeff_2_2: coefficient (2,2) of the transformation matrix.
 * @transform_direction: Direction of transformation.
 * @interpolation: Type of interpolation.
 * @supersample: This parameter is ignored, supersampling is performed based on the interpolation type.
 * @recursion_level: Maximum recursion level used for supersampling (3 is a nice value).
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_matrix() instead.
 *
 * Returns: The transformed drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_matrix (gint32                 drawable_ID,
                                gdouble                coeff_0_0,
                                gdouble                coeff_0_1,
                                gdouble                coeff_0_2,
                                gdouble                coeff_1_0,
                                gdouble                coeff_1_1,
                                gdouble                coeff_1_2,
                                gdouble                coeff_2_0,
                                gdouble                coeff_2_1,
                                gdouble                coeff_2_2,
                                GimpTransformDirection transform_direction,
                                GimpInterpolationType  interpolation,
                                gboolean               supersample,
                                gint                   recursion_level,
                                GimpTransformResize    clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-matrix",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, coeff_0_0,
                                    GIMP_PDB_FLOAT, coeff_0_1,
                                    GIMP_PDB_FLOAT, coeff_0_2,
                                    GIMP_PDB_FLOAT, coeff_1_0,
                                    GIMP_PDB_FLOAT, coeff_1_1,
                                    GIMP_PDB_FLOAT, coeff_1_2,
                                    GIMP_PDB_FLOAT, coeff_2_0,
                                    GIMP_PDB_FLOAT, coeff_2_1,
                                    GIMP_PDB_FLOAT, coeff_2_2,
                                    GIMP_PDB_INT32, transform_direction,
                                    GIMP_PDB_INT32, interpolation,
                                    GIMP_PDB_INT32, supersample,
                                    GIMP_PDB_INT32, recursion_level,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}

/**
 * gimp_drawable_transform_matrix_default:
 * @drawable_ID: The affected drawable.
 * @coeff_0_0: coefficient (0,0) of the transformation matrix.
 * @coeff_0_1: coefficient (0,1) of the transformation matrix.
 * @coeff_0_2: coefficient (0,2) of the transformation matrix.
 * @coeff_1_0: coefficient (1,0) of the transformation matrix.
 * @coeff_1_1: coefficient (1,1) of the transformation matrix.
 * @coeff_1_2: coefficient (1,2) of the transformation matrix.
 * @coeff_2_0: coefficient (2,0) of the transformation matrix.
 * @coeff_2_1: coefficient (2,1) of the transformation matrix.
 * @coeff_2_2: coefficient (2,2) of the transformation matrix.
 * @interpolate: Whether to use interpolation and supersampling.
 * @clip_result: How to clip results.
 *
 * Deprecated: Use gimp_item_transform_matrix() instead.
 *
 * Returns: The transformed drawable.
 *
 * Since: GIMP 2.2
 **/
gint32
gimp_drawable_transform_matrix_default (gint32              drawable_ID,
                                        gdouble             coeff_0_0,
                                        gdouble             coeff_0_1,
                                        gdouble             coeff_0_2,
                                        gdouble             coeff_1_0,
                                        gdouble             coeff_1_1,
                                        gdouble             coeff_1_2,
                                        gdouble             coeff_2_0,
                                        gdouble             coeff_2_1,
                                        gdouble             coeff_2_2,
                                        gboolean            interpolate,
                                        GimpTransformResize clip_result)
{
  GimpParam *return_vals;
  gint nreturn_vals;
  gint32 ret_drawable_ID = -1;

  return_vals = gimp_run_procedure ("gimp-drawable-transform-matrix-default",
                                    &nreturn_vals,
                                    GIMP_PDB_DRAWABLE, drawable_ID,
                                    GIMP_PDB_FLOAT, coeff_0_0,
                                    GIMP_PDB_FLOAT, coeff_0_1,
                                    GIMP_PDB_FLOAT, coeff_0_2,
                                    GIMP_PDB_FLOAT, coeff_1_0,
                                    GIMP_PDB_FLOAT, coeff_1_1,
                                    GIMP_PDB_FLOAT, coeff_1_2,
                                    GIMP_PDB_FLOAT, coeff_2_0,
                                    GIMP_PDB_FLOAT, coeff_2_1,
                                    GIMP_PDB_FLOAT, coeff_2_2,
                                    GIMP_PDB_INT32, interpolate,
                                    GIMP_PDB_INT32, clip_result,
                                    GIMP_PDB_END);

  if (return_vals[0].data.d_status == GIMP_PDB_SUCCESS)
    ret_drawable_ID = return_vals[1].data.d_drawable;

  gimp_destroy_params (return_vals, nreturn_vals);

  return ret_drawable_ID;
}