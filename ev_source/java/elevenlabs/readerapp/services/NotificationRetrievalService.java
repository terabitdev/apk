package io.elevenlabs.readerapp.services;

import android.content.Intent;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage;
import ib.i;
import io.elevenlabs.data.worker.SubmitNotificationTokenWorkerBase;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.NotificationService;
import io.elevenlabs.domain.services.ToastService;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lio/elevenlabs/readerapp/services/NotificationRetrievalService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "", SubmitNotificationTokenWorkerBase.KEY_TOKEN, "Lsn/z;", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Landroid/content/Intent;", "intent", "handleIntent", "(Landroid/content/Intent;)V", ParameterNames.TAG, "Ljava/lang/String;", "Lio/elevenlabs/domain/Logger;", "logger", "Lio/elevenlabs/domain/Logger;", "getLogger", "()Lio/elevenlabs/domain/Logger;", "setLogger", "(Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/domain/services/NotificationService;", "notificationService", "Lio/elevenlabs/domain/services/NotificationService;", "getNotificationService", "()Lio/elevenlabs/domain/services/NotificationService;", "setNotificationService", "(Lio/elevenlabs/domain/services/NotificationService;)V", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/Analytics;", "getAnalytics", "()Lio/elevenlabs/domain/Analytics;", "setAnalytics", "(Lio/elevenlabs/domain/Analytics;)V", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/services/ToastService;", "getToastService", "()Lio/elevenlabs/domain/services/ToastService;", "setToastService", "(Lio/elevenlabs/domain/services/ToastService;)V", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NotificationRetrievalService extends Hilt_NotificationRetrievalService {
    public static final int $stable = 8;
    public Analytics analytics;
    public Logger logger;
    public NotificationService notificationService;
    private final String tag = "NotificationRetrievalService";
    public ToastService toastService;

    public final Analytics getAnalytics() {
        Analytics analytics = this.analytics;
        if (analytics != null) {
            return analytics;
        }
        m.i("analytics");
        throw null;
    }

    public final Logger getLogger() {
        Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        m.i("logger");
        throw null;
    }

    public final NotificationService getNotificationService() {
        NotificationService notificationService = this.notificationService;
        if (notificationService != null) {
            return notificationService;
        }
        m.i("notificationService");
        throw null;
    }

    public final ToastService getToastService() {
        ToastService toastService = this.toastService;
        if (toastService != null) {
            return toastService;
        }
        m.i("toastService");
        throw null;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        String str;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Set<String> keySet;
        intent.getClass();
        Logger logger = getLogger();
        String str2 = this.tag;
        Bundle extras = intent.getExtras();
        if (extras != null && (keySet = extras.keySet()) != null) {
            str = o.E0(keySet, Separators.COMMA, null, null, null, 62);
        } else {
            str = null;
        }
        logger.log(str2, "handleIntent / " + str);
        Bundle extras2 = intent.getExtras();
        if (intent.hasExtra(Constants.MessageNotificationKeys.TITLE) | intent.hasExtra("gcm.notification.title")) {
            getLogger().log(this.tag, "Got Firebase notification");
            if (extras2 == null) {
                extras2 = new Bundle();
            }
            if (NotificationParams.isNotification(extras2) && (string = extras2.getString(Constants.AnalyticsKeys.MESSAGE_LABEL)) != null) {
                getAnalytics().log(new Analytics.Event.NotificationReceived(string));
                extras2.putString(NotificationRetrievalServiceKt.ANALYTICS_LABEL, string);
                if (string.equals("genfm_result_success")) {
                    String string6 = extras2.getString("gcm.notification.title");
                    if (string6 != null && (string4 = extras2.getString("gcm.notification.body")) != null && (string5 = extras2.getString("link")) != null) {
                        getToastService().showToast(new ToastService.Toast.Action(string6, string4, string5));
                    } else {
                        return;
                    }
                } else {
                    String string7 = extras2.getString("gcm.notification.title");
                    if (string7 == null || (string2 = extras2.getString("gcm.notification.body")) == null || (string3 = extras2.getString("link")) == null) {
                        return;
                    } else {
                        getToastService().showToast(new ToastService.Toast.Action(string7, string2, string3));
                    }
                }
            }
        }
        super.handleIntent(intent);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        remoteMessage.getClass();
        super.onMessageReceived(remoteMessage);
        i.r("onMessageReceived from: ", remoteMessage.getFrom(), getLogger(), this.tag);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        token.getClass();
        super.onNewToken(token);
        getLogger().log(this.tag, "onNewToken");
        getNotificationService().saveToken(token);
    }

    public final void setAnalytics(Analytics analytics) {
        analytics.getClass();
        this.analytics = analytics;
    }

    public final void setLogger(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public final void setNotificationService(NotificationService notificationService) {
        notificationService.getClass();
        this.notificationService = notificationService;
    }

    public final void setToastService(ToastService toastService) {
        toastService.getClass();
        this.toastService = toastService;
    }
}
