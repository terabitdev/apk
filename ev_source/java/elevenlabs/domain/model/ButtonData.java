package io.elevenlabs.domain.model;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/domain/model/ButtonData;", "", ParameterNames.TEXT, "", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getDeeplink", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* data */ class ButtonData {
    private final String deeplink;
    private final String text;

    public ButtonData(String str, String str2) {
        str.getClass();
        this.text = str;
        this.deeplink = str2;
    }

    public static /* synthetic */ ButtonData copy$default(ButtonData buttonData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = buttonData.text;
        }
        if ((i10 & 2) != 0) {
            str2 = buttonData.deeplink;
        }
        return buttonData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final ButtonData copy(String text, String deeplink) {
        text.getClass();
        return new ButtonData(text, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonData)) {
            return false;
        }
        ButtonData buttonData = (ButtonData) other;
        if (m.c(this.text, buttonData.text) && m.c(this.deeplink, buttonData.deeplink)) {
            return true;
        }
        return false;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.text.hashCode() * 31;
        String str = this.deeplink;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return h.c("ButtonData(text=", this.text, ", deeplink=", this.deeplink, Separators.RPAREN);
    }

    public /* synthetic */ ButtonData(String str, String str2, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }
}
