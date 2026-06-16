package io.livekit.android.room.types;

import android.gov.nist.javax.sip.parser.TokenNames;
import androidx.room.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import od.b;
import od.j;
import od.l;
import oo.d;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aW\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {TokenNames.T, "Lod/l;", "Loo/d;", "k", "Lkotlin/Function1;", "Lod/j;", "fromJson", "", "toJson", "", "isUnion", "convert", "(Lod/l;Loo/d;Lho/l;Lho/l;Z)Lod/l;", "klaxon", "Lod/l;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AgentTypesKt {
    private static final l klaxon;

    static {
        l lVar = new l();
        f0 f0Var = e0.f20562a;
        klaxon = convert$default(convert$default(convert$default(lVar, f0Var.b(AgentInput.class), AgentTypesKt$klaxon$1.INSTANCE, AgentTypesKt$klaxon$2.INSTANCE, false, 8, null), f0Var.b(AgentOutput.class), AgentTypesKt$klaxon$3.INSTANCE, AgentTypesKt$klaxon$4.INSTANCE, false, 8, null), f0Var.b(AgentState.class), AgentTypesKt$klaxon$5.INSTANCE, AgentTypesKt$klaxon$6.INSTANCE, false, 8, null);
    }

    private static final <T> l convert(l lVar, final d dVar, final ho.l lVar2, final ho.l lVar3, final boolean z6) {
        b bVar = new b() { // from class: io.livekit.android.room.types.AgentTypesKt$convert$1
            @Override // od.b
            public boolean canConvert(Class<?> cls) {
                cls.getClass();
                if (!cls.equals(m0.H(dVar))) {
                    if (!z6 || !m.c(cls.getSuperclass(), m0.H(dVar))) {
                        return false;
                    }
                    return true;
                }
                return true;
            }

            @Override // od.b
            public Object fromJson(j jv) {
                jv.getClass();
                Object invoke = lVar2.invoke(jv);
                invoke.getClass();
                return invoke;
            }

            @Override // od.b
            public String toJson(Object value) {
                value.getClass();
                return (String) ho.l.this.invoke(value);
            }
        };
        lVar.getClass();
        lVar.f25084e.add(0, bVar);
        return lVar;
    }

    public static /* synthetic */ l convert$default(l lVar, d dVar, ho.l lVar2, ho.l lVar3, boolean z6, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        return convert(lVar, dVar, lVar2, lVar3, z6);
    }
}
