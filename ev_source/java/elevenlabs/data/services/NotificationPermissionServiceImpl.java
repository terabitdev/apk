package io.elevenlabs.data.services;

import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import com.google.protobuf.c6;
import io.elevenlabs.data.api.NotificationsApi;
import io.elevenlabs.data.extensions.ApiResultExtensionKt;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.data.model.response.NotificationPrimerResponseModel;
import io.elevenlabs.di.GlobalSharedPreferences;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.NotificationPrimerData;
import io.elevenlabs.domain.model.NotificationPrimerModel;
import io.elevenlabs.domain.model.NotificationPrimerSource;
import io.elevenlabs.domain.services.NotificationPermissionService;
import ir.i1;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u00010B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b#\u0010\"J\u001a\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b%\u0010\"J\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b&\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010/¨\u00061"}, d2 = {"Lio/elevenlabs/data/services/NotificationPermissionServiceImpl;", "Lio/elevenlabs/domain/services/NotificationPermissionService;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lio/elevenlabs/domain/Logger;", "logger", "Landroid/content/Context;", "context", "Lio/elevenlabs/data/api/NotificationsApi;", "notificationsApi", "<init>", "(Landroid/content/SharedPreferences;Lio/elevenlabs/domain/Logger;Landroid/content/Context;Lio/elevenlabs/data/api/NotificationsApi;)V", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "source", "", "shouldShowNotificationPrimer", "(Lio/elevenlabs/domain/model/NotificationPrimerSource;)Z", "", "getPrimerCount", "()I", "count", "", "getCooldownForPrimerCount", "(I)Ljava/lang/Long;", "hasNotificationPermissionGranted", "()Z", "hasSeenNotificationPrimerSourceSync", "isDeviceThatNeedsNotificationPermission", "Lir/i;", "Lio/elevenlabs/domain/model/NotificationPrimerData;", "primerRequests", "()Lir/i;", "Lsn/z;", "requestPrimer", "(Lio/elevenlabs/domain/model/NotificationPrimerSource;Lwn/c;)Ljava/lang/Object;", "recordPrimerShown", "Lio/elevenlabs/domain/model/NotificationPrimerModel;", "fetchNotificationPrimer", "hasSeenNotificationPrimerSource", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/Logger;", "Landroid/content/Context;", "Lio/elevenlabs/data/api/NotificationsApi;", "", ParameterNames.TAG, "Ljava/lang/String;", "Lir/i1;", "Lir/i1;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class NotificationPermissionServiceImpl implements NotificationPermissionService {
    private static final String KEY_LAST_SHOWN_NOTIFICATION_PRIMER_DATE = "last_shown_notification_primer_date";
    private static final String KEY_NOTIFICATION_PRIMER_COUNT = "notification_primer_count";
    private static final String KEY_NOTIFICATION_PRIMER_SOURCE_PREFIX = "notification_primer_source_seen_";
    private static final int MAX_PRIMER_COUNT = 3;
    private final Context context;
    private final Logger logger;
    private final NotificationsApi notificationsApi;
    private final i1 primerRequests;
    private final SharedPreferences sharedPreferences;
    private final String tag;
    private static final long SECOND_PRIMER_COOLDOWN = 86400000;
    private static final long THIRD_PRIMER_COOLDOWN = 432000000;

    public NotificationPermissionServiceImpl(@GlobalSharedPreferences SharedPreferences sharedPreferences, Logger logger, Context context, NotificationsApi notificationsApi) {
        sharedPreferences.getClass();
        logger.getClass();
        context.getClass();
        notificationsApi.getClass();
        this.sharedPreferences = sharedPreferences;
        this.logger = logger;
        this.context = context;
        this.notificationsApi = notificationsApi;
        this.tag = "NotificationPermissionService";
        this.primerRequests = r.a(0, 1, hr.a.f12537b);
    }

    private final Long getCooldownForPrimerCount(int count) {
        if (count != 1) {
            if (count != 2) {
                return null;
            }
            return Long.valueOf(THIRD_PRIMER_COOLDOWN);
        }
        return Long.valueOf(SECOND_PRIMER_COOLDOWN);
    }

    private final int getPrimerCount() {
        return this.sharedPreferences.getInt(KEY_NOTIFICATION_PRIMER_COUNT, 0);
    }

    private final boolean hasNotificationPermissionGranted() {
        if (!isDeviceThatNeedsNotificationPermission() || y5.c.a(this.context, "android.permission.POST_NOTIFICATIONS") == 0) {
            return true;
        }
        return false;
    }

    private final boolean hasSeenNotificationPrimerSourceSync(NotificationPrimerSource source) {
        return this.sharedPreferences.getBoolean(KEY_NOTIFICATION_PRIMER_SOURCE_PREFIX + source.getRawValue(), false);
    }

    private final boolean isDeviceThatNeedsNotificationPermission() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    private final boolean shouldShowNotificationPrimer(NotificationPrimerSource source) {
        ib.i.r("shouldShowNotificationPrimer called for source: ", source.getRawValue(), this.logger, this.tag);
        boolean z6 = false;
        if (hasSeenNotificationPrimerSourceSync(source)) {
            ib.i.r("Already seen primer for source: ", source.getRawValue(), this.logger, this.tag);
            return false;
        }
        if (hasNotificationPermissionGranted()) {
            this.logger.log(this.tag, "Notification permissions already granted");
            return false;
        }
        int primerCount = getPrimerCount();
        if (primerCount >= 3) {
            this.logger.log(this.tag, "Max primer count reached");
            return false;
        }
        if (primerCount == 0) {
            this.logger.log(this.tag, "First primer, showing immediately");
            return true;
        }
        long j4 = this.sharedPreferences.getLong(KEY_LAST_SHOWN_NOTIFICATION_PRIMER_DATE, 0L);
        if (j4 == 0) {
            this.logger.log(this.tag, "Last shown date not found, showing primer");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j4;
        Long cooldownForPrimerCount = getCooldownForPrimerCount(primerCount);
        this.logger.log(this.tag, "Time since last primer: " + currentTimeMillis + " ms, required cooldown: " + cooldownForPrimerCount + " ms");
        if (cooldownForPrimerCount != null && currentTimeMillis >= cooldownForPrimerCount.longValue()) {
            z6 = true;
        }
        this.logger.log("shouldShowNotificationPrimer: Final decision", "shouldShow = " + z6);
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // io.elevenlabs.domain.services.NotificationPermissionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchNotificationPrimer(NotificationPrimerSource notificationPrimerSource, wn.c<? super NotificationPrimerModel> cVar) {
        NotificationPermissionServiceImpl$fetchNotificationPrimer$1 notificationPermissionServiceImpl$fetchNotificationPrimer$1;
        int i10;
        AsyncCallResult domain;
        String str;
        if (cVar instanceof NotificationPermissionServiceImpl$fetchNotificationPrimer$1) {
            notificationPermissionServiceImpl$fetchNotificationPrimer$1 = (NotificationPermissionServiceImpl$fetchNotificationPrimer$1) cVar;
            int i11 = notificationPermissionServiceImpl$fetchNotificationPrimer$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationPermissionServiceImpl$fetchNotificationPrimer$1.label = i11 - Integer.MIN_VALUE;
                Object obj = notificationPermissionServiceImpl$fetchNotificationPrimer$1.result;
                i10 = notificationPermissionServiceImpl$fetchNotificationPrimer$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    NotificationsApi notificationsApi = this.notificationsApi;
                    String rawValue = notificationPrimerSource.getRawValue();
                    notificationPermissionServiceImpl$fetchNotificationPrimer$1.L$0 = null;
                    notificationPermissionServiceImpl$fetchNotificationPrimer$1.label = 1;
                    obj = notificationsApi.getNotificationPrimer(rawValue, notificationPermissionServiceImpl$fetchNotificationPrimer$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                domain = ApiResultExtensionKt.toDomain((ApiResult) obj);
                if (!(domain instanceof AsyncCallResult.Success)) {
                    NotificationPrimerResponseModel notificationPrimerResponseModel = (NotificationPrimerResponseModel) ((AsyncCallResult.Success) domain).getData();
                    return new NotificationPrimerModel(notificationPrimerResponseModel.getExampleNotificationTitle(), notificationPrimerResponseModel.getExampleNotificationSubtitle(), notificationPrimerResponseModel.getTitle(), notificationPrimerResponseModel.getSubtitle());
                }
                if (domain instanceof AsyncCallResult.Error) {
                    AsyncCallResult.AsyncCallError error = ((AsyncCallResult.Error) domain).getError();
                    if (error instanceof AsyncCallResult.AsyncCallError.ApiError) {
                        str = ((AsyncCallResult.AsyncCallError.ApiError) error).getMessage();
                        if (str == null) {
                            str = "API error";
                        }
                    } else if (error instanceof AsyncCallResult.AsyncCallError.UnknownError) {
                        str = ((AsyncCallResult.AsyncCallError.UnknownError) error).getMessage();
                    } else if (error instanceof AsyncCallResult.AsyncCallError.NetworkError) {
                        str = "Network error";
                    } else {
                        c6.p();
                        return null;
                    }
                    ib.i.r("Failed to fetch notification primer: ", str, this.logger, this.tag);
                    return null;
                }
                c6.p();
                return null;
            }
        }
        notificationPermissionServiceImpl$fetchNotificationPrimer$1 = new NotificationPermissionServiceImpl$fetchNotificationPrimer$1(this, cVar);
        Object obj2 = notificationPermissionServiceImpl$fetchNotificationPrimer$1.result;
        i10 = notificationPermissionServiceImpl$fetchNotificationPrimer$1.label;
        if (i10 == 0) {
        }
        domain = ApiResultExtensionKt.toDomain((ApiResult) obj2);
        if (!(domain instanceof AsyncCallResult.Success)) {
        }
    }

    @Override // io.elevenlabs.domain.services.NotificationPermissionService
    public Object hasSeenNotificationPrimerSource(NotificationPrimerSource notificationPrimerSource, wn.c<? super Boolean> cVar) {
        return Boolean.valueOf(hasSeenNotificationPrimerSourceSync(notificationPrimerSource));
    }

    @Override // io.elevenlabs.domain.services.NotificationPermissionService
    public ir.i primerRequests() {
        return this.primerRequests;
    }

    @Override // io.elevenlabs.domain.services.NotificationPermissionService
    public Object recordPrimerShown(NotificationPrimerSource notificationPrimerSource, wn.c<? super z> cVar) {
        this.sharedPreferences.edit().putInt(KEY_NOTIFICATION_PRIMER_COUNT, getPrimerCount() + 1).putLong(KEY_LAST_SHOWN_NOTIFICATION_PRIMER_DATE, System.currentTimeMillis()).putBoolean(KEY_NOTIFICATION_PRIMER_SOURCE_PREFIX + notificationPrimerSource.getRawValue(), true).apply();
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.services.NotificationPermissionService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object requestPrimer(NotificationPrimerSource notificationPrimerSource, wn.c<? super z> cVar) {
        NotificationPermissionServiceImpl$requestPrimer$1 notificationPermissionServiceImpl$requestPrimer$1;
        int i10;
        NotificationPrimerModel notificationPrimerModel;
        if (cVar instanceof NotificationPermissionServiceImpl$requestPrimer$1) {
            notificationPermissionServiceImpl$requestPrimer$1 = (NotificationPermissionServiceImpl$requestPrimer$1) cVar;
            int i11 = notificationPermissionServiceImpl$requestPrimer$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationPermissionServiceImpl$requestPrimer$1.label = i11 - Integer.MIN_VALUE;
                Object obj = notificationPermissionServiceImpl$requestPrimer$1.result;
                i10 = notificationPermissionServiceImpl$requestPrimer$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        notificationPrimerSource = (NotificationPrimerSource) notificationPermissionServiceImpl$requestPrimer$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    if (shouldShowNotificationPrimer(notificationPrimerSource)) {
                        ib.i.r("Requesting notification primer for source: ", notificationPrimerSource.getRawValue(), this.logger, this.tag);
                        notificationPermissionServiceImpl$requestPrimer$1.L$0 = notificationPrimerSource;
                        notificationPermissionServiceImpl$requestPrimer$1.label = 1;
                        obj = fetchNotificationPrimer(notificationPrimerSource, notificationPermissionServiceImpl$requestPrimer$1);
                        Object obj2 = xn.a.f37986a;
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return z.f31622a;
                }
                notificationPrimerModel = (NotificationPrimerModel) obj;
                if (notificationPrimerModel == null) {
                    this.primerRequests.tryEmit(new NotificationPrimerData(notificationPrimerSource, notificationPrimerModel));
                } else {
                    ib.i.r("Failed to fetch notification primer data for source: ", notificationPrimerSource.getRawValue(), this.logger, this.tag);
                }
                return z.f31622a;
            }
        }
        notificationPermissionServiceImpl$requestPrimer$1 = new NotificationPermissionServiceImpl$requestPrimer$1(this, cVar);
        Object obj3 = notificationPermissionServiceImpl$requestPrimer$1.result;
        i10 = notificationPermissionServiceImpl$requestPrimer$1.label;
        if (i10 == 0) {
        }
        notificationPrimerModel = (NotificationPrimerModel) obj3;
        if (notificationPrimerModel == null) {
        }
        return z.f31622a;
    }
}
