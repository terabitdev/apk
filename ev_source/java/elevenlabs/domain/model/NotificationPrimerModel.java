package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import defpackage.f;
import j0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lio/elevenlabs/domain/model/NotificationPrimerModel;", "", "exampleNotificationTitle", "", "exampleNotificationSubtitle", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExampleNotificationTitle", "()Ljava/lang/String;", "getExampleNotificationSubtitle", "getTitle", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class NotificationPrimerModel {
    private final String exampleNotificationSubtitle;
    private final String exampleNotificationTitle;
    private final String subtitle;
    private final String title;

    public NotificationPrimerModel(String str, String str2, String str3, String str4) {
        c.u(str, str2, str3, str4);
        this.exampleNotificationTitle = str;
        this.exampleNotificationSubtitle = str2;
        this.title = str3;
        this.subtitle = str4;
    }

    public static /* synthetic */ NotificationPrimerModel copy$default(NotificationPrimerModel notificationPrimerModel, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = notificationPrimerModel.exampleNotificationTitle;
        }
        if ((i10 & 2) != 0) {
            str2 = notificationPrimerModel.exampleNotificationSubtitle;
        }
        if ((i10 & 4) != 0) {
            str3 = notificationPrimerModel.title;
        }
        if ((i10 & 8) != 0) {
            str4 = notificationPrimerModel.subtitle;
        }
        return notificationPrimerModel.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExampleNotificationTitle() {
        return this.exampleNotificationTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExampleNotificationSubtitle() {
        return this.exampleNotificationSubtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final NotificationPrimerModel copy(String exampleNotificationTitle, String exampleNotificationSubtitle, String title, String subtitle) {
        exampleNotificationTitle.getClass();
        exampleNotificationSubtitle.getClass();
        title.getClass();
        subtitle.getClass();
        return new NotificationPrimerModel(exampleNotificationTitle, exampleNotificationSubtitle, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationPrimerModel)) {
            return false;
        }
        NotificationPrimerModel notificationPrimerModel = (NotificationPrimerModel) other;
        if (m.c(this.exampleNotificationTitle, notificationPrimerModel.exampleNotificationTitle) && m.c(this.exampleNotificationSubtitle, notificationPrimerModel.exampleNotificationSubtitle) && m.c(this.title, notificationPrimerModel.title) && m.c(this.subtitle, notificationPrimerModel.subtitle)) {
            return true;
        }
        return false;
    }

    public final String getExampleNotificationSubtitle() {
        return this.exampleNotificationSubtitle;
    }

    public final String getExampleNotificationTitle() {
        return this.exampleNotificationTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.subtitle.hashCode() + c.c(c.c(this.exampleNotificationTitle.hashCode() * 31, 31, this.exampleNotificationSubtitle), 31, this.title);
    }

    public String toString() {
        String str = this.exampleNotificationTitle;
        String str2 = this.exampleNotificationSubtitle;
        return f.n(f.s("NotificationPrimerModel(exampleNotificationTitle=", str, ", exampleNotificationSubtitle=", str2, ", title="), this.title, ", subtitle=", this.subtitle, Separators.RPAREN);
    }
}
