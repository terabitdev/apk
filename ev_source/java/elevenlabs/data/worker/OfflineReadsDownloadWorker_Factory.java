package io.elevenlabs.data.worker;

import android.content.Context;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final class OfflineReadsDownloadWorker_Factory {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    /* loaded from: classes3.dex */
    public static final class InstanceHolder {
        static final OfflineReadsDownloadWorker_Factory INSTANCE = new OfflineReadsDownloadWorker_Factory();

        private InstanceHolder() {
        }
    }

    public static OfflineReadsDownloadWorker_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static OfflineReadsDownloadWorker newInstance(Context context, WorkerParameters workerParameters) {
        return new OfflineReadsDownloadWorker(context, workerParameters);
    }

    public OfflineReadsDownloadWorker get(Context context, WorkerParameters workerParameters) {
        return newInstance(context, workerParameters);
    }
}
