package io.elevenlabs.ui.components;

import com.google.protobuf.c6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00060\u0005R\u00020\u00002\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00060\nR\u00020\u00002\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\nR\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR:\u0010\b\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u001e\u0012\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lio/elevenlabs/ui/components/ActionSpecBuilder;", "", "<init>", "()V", "Lkotlin/Function1;", "Lio/elevenlabs/ui/components/ActionSpecBuilder$HandlerScope;", "Lsn/z;", "block", "handlers", "(Lho/l;)Lio/elevenlabs/ui/components/ActionSpecBuilder$HandlerScope;", "Lio/elevenlabs/ui/components/ActionSpecBuilder$PlacementScope;", "placement", "(Lho/l;)Lio/elevenlabs/ui/components/ActionSpecBuilder$PlacementScope;", "Lio/elevenlabs/ui/components/ActionSpec;", "build$ui_release", "(Lu2/m;I)Lio/elevenlabs/ui/components/ActionSpec;", "build", "", "Lio/elevenlabs/ui/components/ActionConfig;", "Lwn/c;", "", "Lio/elevenlabs/ui/components/SuspendableHandlerWithConfirm;", "Ljava/util/Map;", "", "startList", "Ljava/util/List;", "endList", "longList", "HandlerScope", "PlacementScope", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@ActionSpecDsl
/* loaded from: classes4.dex */
public final class ActionSpecBuilder {
    public static final int $stable = 8;
    private List<ActionConfig> longList;
    private final Map<ActionConfig, ho.l> handlers = new LinkedHashMap();
    private final List<ActionConfig> startList = new ArrayList();
    private final List<ActionConfig> endList = new ArrayList();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000f\u001a\u00020\u0006*\u00020\u00042 \u0010\b\u001a\u001c\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\u000eH\u0086\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/elevenlabs/ui/components/ActionSpecBuilder$HandlerScope;", "", "<init>", "(Lio/elevenlabs/ui/components/ActionSpecBuilder;)V", "Lio/elevenlabs/ui/components/ActionConfig;", "Lkotlin/Function0;", "Lsn/z;", "Lio/elevenlabs/ui/components/SimpleHandler;", "fn", "handledBy", "(Lio/elevenlabs/ui/components/ActionConfig;Lho/a;)V", "Lkotlin/Function1;", "Lwn/c;", "", "Lio/elevenlabs/ui/components/SuspendableHandlerWithConfirm;", "handledByWithConfirm", "(Lio/elevenlabs/ui/components/ActionConfig;Lho/l;)V", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @ActionSpecDsl
    /* loaded from: classes4.dex */
    public final class HandlerScope {
        public HandlerScope() {
        }

        public final void handledBy(ActionConfig actionConfig, ho.a aVar) {
            actionConfig.getClass();
            aVar.getClass();
            ActionSpecBuilder.this.handlers.put(actionConfig, new ActionSpecBuilder$HandlerScope$handledBy$1(aVar, null));
        }

        public final void handledByWithConfirm(ActionConfig actionConfig, ho.l lVar) {
            actionConfig.getClass();
            lVar.getClass();
            ActionSpecBuilder.this.handlers.put(actionConfig, lVar);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lio/elevenlabs/ui/components/ActionSpecBuilder$PlacementScope;", "", "<init>", "(Lio/elevenlabs/ui/components/ActionSpecBuilder;)V", "value", "", "Lio/elevenlabs/ui/components/ActionConfig;", "startSide", "getStartSide", "()Ljava/util/List;", "setStartSide", "(Ljava/util/List;)V", "endSide", "getEndSide", "setEndSide", "longPress", "getLongPress", "setLongPress", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    @ActionSpecDsl
    /* loaded from: classes4.dex */
    public final class PlacementScope {
        public PlacementScope() {
        }

        public final List<ActionConfig> getEndSide() {
            return ActionSpecBuilder.this.endList;
        }

        public final List<ActionConfig> getLongPress() {
            List<ActionConfig> list = ActionSpecBuilder.this.longList;
            if (list == null) {
                return tn.o.O0(ActionSpecBuilder.this.endList, ActionSpecBuilder.this.startList);
            }
            return list;
        }

        public final List<ActionConfig> getStartSide() {
            return ActionSpecBuilder.this.startList;
        }

        public final void setEndSide(List<ActionConfig> list) {
            list.getClass();
            List list2 = ActionSpecBuilder.this.endList;
            list2.clear();
            list2.addAll(list);
        }

        public final void setLongPress(List<ActionConfig> list) {
            list.getClass();
            ActionSpecBuilder.this.longList = new ArrayList(list);
        }

        public final void setStartSide(List<ActionConfig> list) {
            list.getClass();
            List list2 = ActionSpecBuilder.this.startList;
            list2.clear();
            list2.addAll(list);
        }
    }

    public final ActionSpec build$ui_release(u2.m mVar, int i10) {
        Object obj;
        Iterable iterable = this.longList;
        if (iterable == null) {
            iterable = tn.o.O0(this.endList, this.startList);
        }
        Iterator it = tn.o.O0(iterable, tn.o.O0(this.endList, this.startList)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!this.handlers.containsKey((ActionConfig) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ActionConfig actionConfig = (ActionConfig) obj;
        if (actionConfig == null) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(1069072584);
            Map<ActionConfig, ho.l> map = this.handlers;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tn.a0.H(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), u2.r.H(entry.getValue(), qVar));
            }
            qVar.p(false);
            List g12 = tn.o.g1(this.startList);
            List g13 = tn.o.g1(this.endList);
            List g14 = tn.o.g1(iterable);
            boolean h10 = qVar.h(linkedHashMap);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new ActionSpecBuilder$build$2$1(linkedHashMap, null);
                qVar.h0(L);
            }
            return new ActionSpec(g12, g13, g14, (ho.p) L);
        }
        c6.v(defpackage.f.C("No handler for action '", actionConfig.getText(), "'."));
        return null;
    }

    public final HandlerScope handlers(ho.l block) {
        block.getClass();
        HandlerScope handlerScope = new HandlerScope();
        block.invoke(handlerScope);
        return handlerScope;
    }

    public final PlacementScope placement(ho.l block) {
        block.getClass();
        PlacementScope placementScope = new PlacementScope();
        block.invoke(placementScope);
        return placementScope;
    }
}
