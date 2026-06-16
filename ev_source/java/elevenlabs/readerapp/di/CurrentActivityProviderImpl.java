package io.elevenlabs.readerapp.di;

import android.app.Activity;
import android.app.Application;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.os.Bundle;
import io.elevenlabs.readerapp.usecase.CurrentActivityProvider;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/elevenlabs/readerapp/di/CurrentActivityProviderImpl;", "Lio/elevenlabs/readerapp/usecase/CurrentActivityProvider;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "currentActivity", "getCurrentActivity", "()Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class CurrentActivityProviderImpl implements CurrentActivityProvider {
    public static final int $stable = 8;
    private WeakReference<Activity> activityRef;

    public CurrentActivityProviderImpl(Application application) {
        application.getClass();
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: io.elevenlabs.readerapp.di.CurrentActivityProviderImpl.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Activity activity2;
                activity.getClass();
                WeakReference weakReference = CurrentActivityProviderImpl.this.activityRef;
                if (weakReference != null) {
                    activity2 = (Activity) weakReference.get();
                } else {
                    activity2 = null;
                }
                if (activity2 == activity) {
                    CurrentActivityProviderImpl.this.activityRef = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                activity.getClass();
                CurrentActivityProviderImpl.this.activityRef = new WeakReference(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                activity.getClass();
                outState.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                activity.getClass();
            }
        });
    }

    @Override // io.elevenlabs.readerapp.usecase.CurrentActivityProvider
    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.activityRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
