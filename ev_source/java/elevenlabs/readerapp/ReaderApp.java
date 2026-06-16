package io.elevenlabs.readerapp;

import com.google.firebase.Firebase;
import com.google.firebase.appcheck.FirebaseAppCheckKt;
import com.google.firebase.appcheck.playintegrity.PlayIntegrityAppCheckProviderFactory;
import com.google.firebase.perf.FirebasePerformance;
import io.elevenlabs.readerapp.usecase.CurrentActivityProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/readerapp/ReaderApp;", "Landroid/app/Application;", "<init>", "()V", "Lsn/z;", "onCreate", "Lio/elevenlabs/readerapp/InstallIntegrityCheck;", "installIntegrityCheck", "Lio/elevenlabs/readerapp/InstallIntegrityCheck;", "getInstallIntegrityCheck", "()Lio/elevenlabs/readerapp/InstallIntegrityCheck;", "setInstallIntegrityCheck", "(Lio/elevenlabs/readerapp/InstallIntegrityCheck;)V", "Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", "currentActivityProvider", "Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", "getCurrentActivityProvider", "()Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", "setCurrentActivityProvider", "(Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public class ReaderApp extends Hilt_ReaderApp {
    public static final int $stable = 8;
    public CurrentActivityProvider currentActivityProvider;
    public InstallIntegrityCheck installIntegrityCheck;

    public final CurrentActivityProvider getCurrentActivityProvider() {
        CurrentActivityProvider currentActivityProvider = this.currentActivityProvider;
        if (currentActivityProvider != null) {
            return currentActivityProvider;
        }
        m.i("currentActivityProvider");
        throw null;
    }

    public final InstallIntegrityCheck getInstallIntegrityCheck() {
        InstallIntegrityCheck installIntegrityCheck = this.installIntegrityCheck;
        if (installIntegrityCheck != null) {
            return installIntegrityCheck;
        }
        m.i("installIntegrityCheck");
        throw null;
    }

    @Override // io.elevenlabs.readerapp.Hilt_ReaderApp, android.app.Application
    public void onCreate() {
        super.onCreate();
        FirebasePerformance.getInstance().setPerformanceCollectionEnabled(true);
        FirebaseAppCheckKt.getAppCheck(Firebase.INSTANCE).installAppCheckProviderFactory(PlayIntegrityAppCheckProviderFactory.getInstance());
    }

    public final void setCurrentActivityProvider(CurrentActivityProvider currentActivityProvider) {
        currentActivityProvider.getClass();
        this.currentActivityProvider = currentActivityProvider;
    }

    public final void setInstallIntegrityCheck(InstallIntegrityCheck installIntegrityCheck) {
        installIntegrityCheck.getClass();
        this.installIntegrityCheck = installIntegrityCheck;
    }
}
