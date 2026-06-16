package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import defpackage.f;
import j0.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import p.n;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lio/elevenlabs/domain/model/AppConfig;", "", "defaultVoice", "", "minAppVersion", "notificationChannels", "", "Lio/elevenlabs/domain/model/AppConfig$NotificationChannelConfig;", "reportProblemUrl", "copyrightTakedownUrl", "contentProviderWaitlistUrl", "androidRtlCanvasValidation", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDefaultVoice", "()Ljava/lang/String;", "getMinAppVersion", "getNotificationChannels", "()Ljava/util/List;", "getReportProblemUrl", "getCopyrightTakedownUrl", "getContentProviderWaitlistUrl", "getAndroidRtlCanvasValidation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "NotificationChannelConfig", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class AppConfig {
    private final boolean androidRtlCanvasValidation;
    private final String contentProviderWaitlistUrl;
    private final String copyrightTakedownUrl;
    private final String defaultVoice;
    private final String minAppVersion;
    private final List<NotificationChannelConfig> notificationChannels;
    private final String reportProblemUrl;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/AppConfig$NotificationChannelConfig;", "", "id", "", DiagnosticsEntry.NAME_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final /* data */ class NotificationChannelConfig {
        private final String id;
        private final String name;

        public NotificationChannelConfig(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.name = str2;
        }

        public static /* synthetic */ NotificationChannelConfig copy$default(NotificationChannelConfig notificationChannelConfig, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = notificationChannelConfig.id;
            }
            if ((i10 & 2) != 0) {
                str2 = notificationChannelConfig.name;
            }
            return notificationChannelConfig.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final NotificationChannelConfig copy(String id2, String name) {
            id2.getClass();
            name.getClass();
            return new NotificationChannelConfig(id2, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationChannelConfig)) {
                return false;
            }
            NotificationChannelConfig notificationChannelConfig = (NotificationChannelConfig) other;
            if (m.c(this.id, notificationChannelConfig.id) && m.c(this.name, notificationChannelConfig.name)) {
                return true;
            }
            return false;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode() + (this.id.hashCode() * 31);
        }

        public String toString() {
            return h.c("NotificationChannelConfig(id=", this.id, ", name=", this.name, Separators.RPAREN);
        }
    }

    public AppConfig(String str, String str2, List<NotificationChannelConfig> list, String str3, String str4, String str5, boolean z6) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.defaultVoice = str;
        this.minAppVersion = str2;
        this.notificationChannels = list;
        this.reportProblemUrl = str3;
        this.copyrightTakedownUrl = str4;
        this.contentProviderWaitlistUrl = str5;
        this.androidRtlCanvasValidation = z6;
    }

    public static /* synthetic */ AppConfig copy$default(AppConfig appConfig, String str, String str2, List list, String str3, String str4, String str5, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = appConfig.defaultVoice;
        }
        if ((i10 & 2) != 0) {
            str2 = appConfig.minAppVersion;
        }
        if ((i10 & 4) != 0) {
            list = appConfig.notificationChannels;
        }
        if ((i10 & 8) != 0) {
            str3 = appConfig.reportProblemUrl;
        }
        if ((i10 & 16) != 0) {
            str4 = appConfig.copyrightTakedownUrl;
        }
        if ((i10 & 32) != 0) {
            str5 = appConfig.contentProviderWaitlistUrl;
        }
        if ((i10 & 64) != 0) {
            z6 = appConfig.androidRtlCanvasValidation;
        }
        String str6 = str5;
        boolean z10 = z6;
        String str7 = str4;
        List list2 = list;
        return appConfig.copy(str, str2, list2, str3, str7, str6, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDefaultVoice() {
        return this.defaultVoice;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final List<NotificationChannelConfig> component3() {
        return this.notificationChannels;
    }

    /* renamed from: component4, reason: from getter */
    public final String getReportProblemUrl() {
        return this.reportProblemUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCopyrightTakedownUrl() {
        return this.copyrightTakedownUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContentProviderWaitlistUrl() {
        return this.contentProviderWaitlistUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAndroidRtlCanvasValidation() {
        return this.androidRtlCanvasValidation;
    }

    public final AppConfig copy(String defaultVoice, String minAppVersion, List<NotificationChannelConfig> notificationChannels, String reportProblemUrl, String copyrightTakedownUrl, String contentProviderWaitlistUrl, boolean androidRtlCanvasValidation) {
        defaultVoice.getClass();
        minAppVersion.getClass();
        notificationChannels.getClass();
        reportProblemUrl.getClass();
        copyrightTakedownUrl.getClass();
        contentProviderWaitlistUrl.getClass();
        return new AppConfig(defaultVoice, minAppVersion, notificationChannels, reportProblemUrl, copyrightTakedownUrl, contentProviderWaitlistUrl, androidRtlCanvasValidation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppConfig)) {
            return false;
        }
        AppConfig appConfig = (AppConfig) other;
        if (m.c(this.defaultVoice, appConfig.defaultVoice) && m.c(this.minAppVersion, appConfig.minAppVersion) && m.c(this.notificationChannels, appConfig.notificationChannels) && m.c(this.reportProblemUrl, appConfig.reportProblemUrl) && m.c(this.copyrightTakedownUrl, appConfig.copyrightTakedownUrl) && m.c(this.contentProviderWaitlistUrl, appConfig.contentProviderWaitlistUrl) && this.androidRtlCanvasValidation == appConfig.androidRtlCanvasValidation) {
            return true;
        }
        return false;
    }

    public final boolean getAndroidRtlCanvasValidation() {
        return this.androidRtlCanvasValidation;
    }

    public final String getContentProviderWaitlistUrl() {
        return this.contentProviderWaitlistUrl;
    }

    public final String getCopyrightTakedownUrl() {
        return this.copyrightTakedownUrl;
    }

    public final String getDefaultVoice() {
        return this.defaultVoice;
    }

    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final List<NotificationChannelConfig> getNotificationChannels() {
        return this.notificationChannels;
    }

    public final String getReportProblemUrl() {
        return this.reportProblemUrl;
    }

    public int hashCode() {
        return Boolean.hashCode(this.androidRtlCanvasValidation) + c.c(c.c(c.c(n.d(c.c(this.defaultVoice.hashCode() * 31, 31, this.minAppVersion), 31, this.notificationChannels), 31, this.reportProblemUrl), 31, this.copyrightTakedownUrl), 31, this.contentProviderWaitlistUrl);
    }

    public String toString() {
        String str = this.defaultVoice;
        String str2 = this.minAppVersion;
        List<NotificationChannelConfig> list = this.notificationChannels;
        String str3 = this.reportProblemUrl;
        String str4 = this.copyrightTakedownUrl;
        String str5 = this.contentProviderWaitlistUrl;
        boolean z6 = this.androidRtlCanvasValidation;
        StringBuilder s10 = f.s("AppConfig(defaultVoice=", str, ", minAppVersion=", str2, ", notificationChannels=");
        s10.append(list);
        s10.append(", reportProblemUrl=");
        s10.append(str3);
        s10.append(", copyrightTakedownUrl=");
        f.x(s10, str4, ", contentProviderWaitlistUrl=", str5, ", androidRtlCanvasValidation=");
        return n.j(Separators.RPAREN, s10, z6);
    }

    public /* synthetic */ AppConfig(String str, String str2, List list, String str3, String str4, String str5, boolean z6, int i10, kotlin.jvm.internal.f fVar) {
        this(str, str2, list, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? "" : str4, (i10 & 32) != 0 ? "" : str5, (i10 & 64) != 0 ? true : z6);
    }
}
