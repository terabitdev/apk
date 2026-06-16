package io.elevenlabs.ui.echo.components;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import ho.a;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lio/elevenlabs/ui/echo/components/EchoToastAction;", "", "", ParameterNames.TEXT, "", ParameterNames.ICON, "Lkotlin/Function0;", "Lsn/z;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lho/a;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Lho/a;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lho/a;)Lio/elevenlabs/ui/echo/components/EchoToastAction;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Ljava/lang/Integer;", "getIcon", "Lho/a;", "getOnClick", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class EchoToastAction {
    public static final int $stable = 0;
    private final Integer icon;
    private final a onClick;
    private final String text;

    public EchoToastAction(String str, Integer num, a aVar) {
        str.getClass();
        aVar.getClass();
        this.text = str;
        this.icon = num;
        this.onClick = aVar;
    }

    public static /* synthetic */ EchoToastAction copy$default(EchoToastAction echoToastAction, String str, Integer num, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = echoToastAction.text;
        }
        if ((i10 & 2) != 0) {
            num = echoToastAction.icon;
        }
        if ((i10 & 4) != 0) {
            aVar = echoToastAction.onClick;
        }
        return echoToastAction.copy(str, num, aVar);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final a getOnClick() {
        return this.onClick;
    }

    public final EchoToastAction copy(String text, Integer icon, a onClick) {
        text.getClass();
        onClick.getClass();
        return new EchoToastAction(text, icon, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EchoToastAction)) {
            return false;
        }
        EchoToastAction echoToastAction = (EchoToastAction) other;
        if (m.c(this.text, echoToastAction.text) && m.c(this.icon, echoToastAction.icon) && m.c(this.onClick, echoToastAction.onClick)) {
            return true;
        }
        return false;
    }

    public final Integer getIcon() {
        return this.icon;
    }

    public final a getOnClick() {
        return this.onClick;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.text.hashCode() * 31;
        Integer num = this.icon;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return this.onClick.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public String toString() {
        return "EchoToastAction(text=" + this.text + ", icon=" + this.icon + ", onClick=" + this.onClick + Separators.RPAREN;
    }

    public /* synthetic */ EchoToastAction(String str, Integer num, a aVar, int i10, f fVar) {
        this(str, (i10 & 2) != 0 ? null : num, aVar);
    }
}
