package io.elevenlabs.data.worker;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OfflineExpiryCleanupWorker_Factory {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final OfflineExpiryCleanupWorker_Factory INSTANCE = new OfflineExpiryCleanupWorker_Factory();

        private InstanceHolder() {
        }
    }

    public static OfflineExpiryCleanupWorker_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OfflineExpiryCleanupWorker newInstance(Context context, WorkerParameters workerParameters) {
        return new OfflineExpiryCleanupWorker(context, workerParameters);
    }

    public OfflineExpiryCleanupWorker get(Context context, WorkerParameters workerParameters) {
        return newInstance(context, workerParameters);
    }
}
