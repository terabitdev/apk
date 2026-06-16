package io.elevenlabs.ui.components;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B[\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012&\u0010\u000b\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ0\u0010\u0012\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013Jj\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022(\b\u0002\u0010\u000b\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\nHÀ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\u000fR7\u0010\u000b\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006'"}, d2 = {"Lio/elevenlabs/ui/components/ActionSpec;", "", "", "Lio/elevenlabs/ui/components/ActionConfig;", "startSide", "endSide", "longPress", "Lkotlin/Function2;", "Lwn/c;", "", "Lio/elevenlabs/ui/components/SuspendableActionHandlerWithConfirm;", "onAction", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lho/p;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()Lho/p;", "copy$ui_release", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lho/p;)Lio/elevenlabs/ui/components/ActionSpec;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getStartSide", "getEndSide", "getLongPress", "Lho/p;", "getOnAction", "Companion", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ActionSpec {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<ActionConfig> endSide;
    private final List<ActionConfig> longPress;
    private final ho.p onAction;
    private final List<ActionConfig> startSide;

    public ActionSpec(List<ActionConfig> list, List<ActionConfig> list2, List<ActionConfig> list3, ho.p pVar) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        pVar.getClass();
        this.startSide = list;
        this.endSide = list2;
        this.longPress = list3;
        this.onAction = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionSpec copy$ui_release$default(ActionSpec actionSpec, List list, List list2, List list3, ho.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = actionSpec.startSide;
        }
        if ((i10 & 2) != 0) {
            list2 = actionSpec.endSide;
        }
        if ((i10 & 4) != 0) {
            list3 = actionSpec.longPress;
        }
        if ((i10 & 8) != 0) {
            pVar = actionSpec.onAction;
        }
        return actionSpec.copy$ui_release(list, list2, list3, pVar);
    }

    public final List<ActionConfig> component1() {
        return this.startSide;
    }

    public final List<ActionConfig> component2() {
        return this.endSide;
    }

    public final List<ActionConfig> component3() {
        return this.longPress;
    }

    /* renamed from: component4, reason: from getter */
    public final ho.p getOnAction() {
        return this.onAction;
    }

    public final ActionSpec copy$ui_release(List<ActionConfig> startSide, List<ActionConfig> endSide, List<ActionConfig> longPress, ho.p onAction) {
        startSide.getClass();
        endSide.getClass();
        longPress.getClass();
        onAction.getClass();
        return new ActionSpec(startSide, endSide, longPress, onAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionSpec)) {
            return false;
        }
        ActionSpec actionSpec = (ActionSpec) other;
        if (kotlin.jvm.internal.m.c(this.startSide, actionSpec.startSide) && kotlin.jvm.internal.m.c(this.endSide, actionSpec.endSide) && kotlin.jvm.internal.m.c(this.longPress, actionSpec.longPress) && kotlin.jvm.internal.m.c(this.onAction, actionSpec.onAction)) {
            return true;
        }
        return false;
    }

    public final List<ActionConfig> getEndSide() {
        return this.endSide;
    }

    public final List<ActionConfig> getLongPress() {
        return this.longPress;
    }

    public final ho.p getOnAction() {
        return this.onAction;
    }

    public final List<ActionConfig> getStartSide() {
        return this.startSide;
    }

    public int hashCode() {
        return this.onAction.hashCode() + p.n.d(p.n.d(this.startSide.hashCode() * 31, 31, this.endSide), 31, this.longPress);
    }

    public String toString() {
        return "ActionSpec(startSide=" + this.startSide + ", endSide=" + this.endSide + ", longPress=" + this.longPress + ", onAction=" + this.onAction + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lio/elevenlabs/ui/components/ActionSpec$Companion;", "", "<init>", "()V", "noActions", "Lio/elevenlabs/ui/components/ActionSpec;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final ActionSpec noActions() {
            ActionSpec$Companion$noActions$1 actionSpec$Companion$noActions$1 = new ActionSpec$Companion$noActions$1(null);
            tn.t tVar = tn.t.f33547a;
            return new ActionSpec(tVar, tVar, tVar, actionSpec$Companion$noActions$1);
        }

        private Companion() {
        }
    }
}
