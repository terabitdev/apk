package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/elevenlabs/domain/model/NotificationPrimerData;", "", "source", "Lio/elevenlabs/domain/model/NotificationPrimerSource;", "model", "Lio/elevenlabs/domain/model/NotificationPrimerModel;", "<init>", "(Lio/elevenlabs/domain/model/NotificationPrimerSource;Lio/elevenlabs/domain/model/NotificationPrimerModel;)V", "getSource", "()Lio/elevenlabs/domain/model/NotificationPrimerSource;", "getModel", "()Lio/elevenlabs/domain/model/NotificationPrimerModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class NotificationPrimerData {
    private final NotificationPrimerModel model;
    private final NotificationPrimerSource source;

    public NotificationPrimerData(NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel) {
        notificationPrimerSource.getClass();
        notificationPrimerModel.getClass();
        this.source = notificationPrimerSource;
        this.model = notificationPrimerModel;
    }

    public static /* synthetic */ NotificationPrimerData copy$default(NotificationPrimerData notificationPrimerData, NotificationPrimerSource notificationPrimerSource, NotificationPrimerModel notificationPrimerModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            notificationPrimerSource = notificationPrimerData.source;
        }
        if ((i10 & 2) != 0) {
            notificationPrimerModel = notificationPrimerData.model;
        }
        return notificationPrimerData.copy(notificationPrimerSource, notificationPrimerModel);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationPrimerSource getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationPrimerModel getModel() {
        return this.model;
    }

    public final NotificationPrimerData copy(NotificationPrimerSource source, NotificationPrimerModel model) {
        source.getClass();
        model.getClass();
        return new NotificationPrimerData(source, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationPrimerData)) {
            return false;
        }
        NotificationPrimerData notificationPrimerData = (NotificationPrimerData) other;
        if (this.source == notificationPrimerData.source && m.c(this.model, notificationPrimerData.model)) {
            return true;
        }
        return false;
    }

    public final NotificationPrimerModel getModel() {
        return this.model;
    }

    public final NotificationPrimerSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.model.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        return "NotificationPrimerData(source=" + this.source + ", model=" + this.model + Separators.RPAREN;
    }
}
