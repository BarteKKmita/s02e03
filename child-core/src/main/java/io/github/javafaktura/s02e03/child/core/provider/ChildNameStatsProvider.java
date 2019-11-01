package io.github.javafaktura.s02e03.child.core.provider;

import io.github.javafaktura.s02e03.child.core.model.ChildNameStats;

import java.util.List;

public interface ChildNameStatsProvider {
    List<ChildNameStats> load();
}
