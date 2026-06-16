package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.BackEventCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import j$.util.Objects;

/* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class MaterialBackOrchestrator {

    @Nullable
    private final BackCallbackDelegate backCallbackDelegate;

    @NonNull
    private final MaterialBackHandler backHandler;

    @NonNull
    private final View view;

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @RequiresApi(33)
    /* loaded from: classes4.dex */
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {

        @Nullable
        private OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
        }

        public OnBackInvokedCallback createOnBackInvokedCallback(@NonNull final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.a
                public final void onBackInvoked() {
                    MaterialBackHandler.this.handleBackInvoked();
                }
            };
        }

        public boolean isListeningForBackCallbacks() {
            if (this.onBackInvokedCallback != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            int i;
            if (this.onBackInvokedCallback != null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            OnBackInvokedCallback createOnBackInvokedCallback = createOnBackInvokedCallback(materialBackHandler);
            this.onBackInvokedCallback = createOnBackInvokedCallback;
            if (z10) {
                i = 1000000;
            } else {
                i = 0;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i, createOnBackInvokedCallback);
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @DoNotInline
        public void stopListeningForBackCallbacks(@NonNull View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.onBackInvokedCallback == null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.onBackInvokedCallback = null;
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    @RequiresApi(34)
    /* loaded from: classes4.dex */
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public OnBackInvokedCallback createOnBackInvokedCallback(@NonNull final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public void onBackCancelled() {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.cancelBackProgress();
                }

                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                public void onBackProgressed(@NonNull BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.updateBackProgress(new BackEventCompat(backEvent));
                }

                public void onBackStarted(@NonNull BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.startBackProgress(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* compiled from: r8-map-id-e907cdfad2df14fd92982b00c76004907cc554632fe47bc57470e213e2fdbf5b */
    /* loaded from: classes4.dex */
    public interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view, boolean z10);

        void stopListeningForBackCallbacks(@NonNull View view);
    }

    public MaterialBackOrchestrator(@NonNull MaterialBackHandler materialBackHandler, @NonNull View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    @Nullable
    private static BackCallbackDelegate createBackCallbackDelegate() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (i < 33) {
            return null;
        }
        return new Api33BackCallbackDelegate();
    }

    private void startListeningForBackCallbacks(boolean z10) {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z10);
        }
    }

    public boolean shouldListenForBackCallbacks() {
        if (this.backCallbackDelegate != null) {
            return true;
        }
        return false;
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    public void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(@NonNull T t) {
        this(t, t);
    }
}
