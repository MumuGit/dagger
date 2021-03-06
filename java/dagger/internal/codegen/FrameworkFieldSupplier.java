/*
 * Copyright (C) 2017 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dagger.internal.codegen;

/** An object that supplies a {@link MemberSelect} for a framework field. */
interface FrameworkFieldSupplier {
  /** Returns a {@link MemberSelect}, with possible side effects on the first call. */
  MemberSelect memberSelect();

  /**
   * If true, signals that a publicly-visible concrete type was used to replace the original type
   * of the field being initialized.
   */
  default boolean fieldTypeReplaced() {
    return false;
  }
}
