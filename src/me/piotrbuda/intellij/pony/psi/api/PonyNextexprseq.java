// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface PonyNextexprseq extends PsiElement {

    @NotNull
    PonyNextassignment getNextassignment();

    @Nullable
    PonyNosemi getNosemi();

    @Nullable
    PonySemiexpr getSemiexpr();

}