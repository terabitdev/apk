package io.elevenlabs;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ho.p;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJE\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042.\u0010\r\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\b\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/elevenlabs/ClientToolRegistryBuilder;", "", "<init>", "()V", "", DiagnosticsEntry.NAME_KEY, "Lio/elevenlabs/ClientTool;", "tool", "addTool", "(Ljava/lang/String;Lio/elevenlabs/ClientTool;)Lio/elevenlabs/ClientToolRegistryBuilder;", "Lkotlin/Function2;", "", "Lwn/c;", "function", "(Ljava/lang/String;Lho/p;)Lio/elevenlabs/ClientToolRegistryBuilder;", "Lio/elevenlabs/ClientToolRegistry;", "build", "()Lio/elevenlabs/ClientToolRegistry;", "registry", "Lio/elevenlabs/ClientToolRegistry;", "elevenlabs-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ClientToolRegistryBuilder {
    private final ClientToolRegistry registry = new ClientToolRegistry();

    public final ClientToolRegistryBuilder addTool(String name, p function) {
        name.getClass();
        function.getClass();
        this.registry.registerTool(name, new ClientToolRegistryBuilder$addTool$1(function));
        return this;
    }

    /* renamed from: build, reason: from getter */
    public final ClientToolRegistry getRegistry() {
        return this.registry;
    }

    public final ClientToolRegistryBuilder addTool(String name, ClientTool tool) {
        name.getClass();
        tool.getClass();
        this.registry.registerTool(name, tool);
        return this;
    }
}
