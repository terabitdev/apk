package io.elevenlabs.readerapp;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.debug.internal.ExchangeDebugTokenRequest;
import com.google.firebase.appcheck.internal.AppCheckTokenResponse;
import com.google.firebase.appcheck.internal.DefaultAppCheckToken;
import com.google.firebase.appcheck.internal.NetworkClient;
import com.google.firebase.appcheck.internal.RetryManager;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000fH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/StaticAppCheckProvider;", "Lcom/google/firebase/appcheck/AppCheckProvider;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "debugSecret", "", "<init>", "(Lcom/google/firebase/FirebaseApp;Ljava/lang/String;)V", "networkClient", "Lcom/google/firebase/appcheck/internal/NetworkClient;", "backgroundExecutor", "Ljava/util/concurrent/ExecutorService;", "retryManager", "Lcom/google/firebase/appcheck/internal/RetryManager;", "debugSecretTask", "Lcom/google/android/gms/tasks/Task;", "getToken", "Lcom/google/firebase/appcheck/AppCheckToken;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class StaticAppCheckProvider implements AppCheckProvider {
    public static final String UTF_8 = "UTF-8";
    private final ExecutorService backgroundExecutor;
    private final Task<String> debugSecretTask;
    private final NetworkClient networkClient;
    private final RetryManager retryManager;
    public static final int $stable = 8;

    public StaticAppCheckProvider(FirebaseApp firebaseApp, String str) {
        firebaseApp.getClass();
        this.networkClient = new NetworkClient(firebaseApp);
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        newCachedThreadPool.getClass();
        this.backgroundExecutor = newCachedThreadPool;
        this.retryManager = new RetryManager();
        Task<String> forResult = Tasks.forResult(str);
        forResult.getClass();
        this.debugSecretTask = forResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getToken$lambda$0(StaticAppCheckProvider staticAppCheckProvider, Task task) {
        task.getClass();
        Object result = task.getResult();
        result.getClass();
        return Tasks.call(staticAppCheckProvider.backgroundExecutor, new c8.j(staticAppCheckProvider, new ExchangeDebugTokenRequest((String) result), 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCheckTokenResponse getToken$lambda$0$0(StaticAppCheckProvider staticAppCheckProvider, ExchangeDebugTokenRequest exchangeDebugTokenRequest) {
        NetworkClient networkClient = staticAppCheckProvider.networkClient;
        String jsonString = exchangeDebugTokenRequest.toJsonString();
        jsonString.getClass();
        Charset forName = Charset.forName(UTF_8);
        forName.getClass();
        byte[] bytes = jsonString.getBytes(forName);
        bytes.getClass();
        return networkClient.exchangeAttestationForAppCheckToken(bytes, 2, staticAppCheckProvider.retryManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task getToken$lambda$1(Task task) {
        task.getClass();
        if (task.isSuccessful()) {
            return Tasks.forResult(DefaultAppCheckToken.constructFromAppCheckTokenResponse((AppCheckTokenResponse) task.getResult()));
        }
        Exception exception = task.getException();
        exception.getClass();
        return Tasks.forException(exception);
    }

    @Override // com.google.firebase.appcheck.AppCheckProvider
    public Task<AppCheckToken> getToken() {
        Task<AppCheckToken> continueWithTask = this.debugSecretTask.continueWithTask(new Continuation() { // from class: io.elevenlabs.readerapp.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task token$lambda$0;
                token$lambda$0 = StaticAppCheckProvider.getToken$lambda$0(StaticAppCheckProvider.this, task);
                return token$lambda$0;
            }
        }).continueWithTask(new Object());
        continueWithTask.getClass();
        return continueWithTask;
    }
}
